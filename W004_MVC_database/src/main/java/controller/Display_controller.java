package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_dao;
import model.User;

@WebServlet("/display")
public class Display_controller extends HttpServlet 

{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	User_dao d = new User_dao();
    	ArrayList<User> a = d.getalluser();
    	
    	req.setAttribute("data", a);
    	req.getRequestDispatcher("Display.jsp").forward(req, resp);
    	
    	
    }
}
