package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Labour_dao;
import model.labour;

@WebServlet("/login")
public class Login_controller extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		labour l = new labour();
		l.setEmail(email);
        l.setPass(pass);   
        
        Labour_dao d = new Labour_dao();
      boolean i = d.logincheck(l);
        if(i)
        {
          req.setAttribute("msg", email);
          req.getRequestDispatcher("Home.jsp").forward(req, resp);
        }
        else
        {
        	req.setAttribute("err", "Invalid email and password");
        	req.getRequestDispatcher("Registration.jsp").forward(req, resp);
        }
	}
}
