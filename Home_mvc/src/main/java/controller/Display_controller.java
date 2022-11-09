package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Labour_dao;
import model.labour;

@WebServlet("/display")
public class Display_controller extends HttpServlet
{
  
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	Labour_dao l = new Labour_dao();
	ArrayList<labour> al = l.getalllabour();
	
	req.setAttribute("data", al);
	req.getRequestDispatcher("Display.jsp").forward(req, resp);
}
}
