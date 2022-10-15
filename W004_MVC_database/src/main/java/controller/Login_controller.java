package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_dao;
import model.User;

@WebServlet("/login")
public class Login_controller extends HttpServlet
{
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String email = req.getParameter("email");
       String pass = req.getParameter("pass");
       
       User u = new User();
       u.setEmail(email);
       u.setPass(pass);       
       
       
       User_dao d = new User_dao();
       boolean i = d.logincheck(u);
       if(i)
       {
    	   req.setAttribute("msg", email);
    	   req.getRequestDispatcher("Home.jsp").forward(req, resp);
       }
       else
       {
    	   req.setAttribute("err", "invalid email and password");
    	   req.getRequestDispatcher("Login.jsp").forward(req, resp);
       }
       }
	
	
}
