package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Labour_dao;
import model.labour;

@WebServlet("/reg")
public class Registration_controller extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	  String lname = req.getParameter("lname");
	  String email = req.getParameter("email");
	  String pass = req.getParameter("pass");
	  
	  labour u = new labour();
	  u.setLname(lname);
	  u.setEmail(email);
	  u.setPass(pass);
	
	Labour_dao d = new Labour_dao();
	int i = d.addlabour(u);
	
	if(i>0)
	{
		req.setAttribute("msg", "registration succefully!!!!");
		req.getRequestDispatcher("Registration.jsp").forward(req, resp);
	}
	}

}
