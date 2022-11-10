package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Labour_dao;
import model.labour;

@WebServlet("/updatelabour")
public class Updatelabour__controller extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int lid = Integer.parseInt(req.getParameter("lid"));
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		labour l = new labour();
		l.setId(lid);
		l.setLname(lname);
		l.setEmail(email);
		l.setPass(pass);
		
		Labour_dao d = new Labour_dao();
		int i = d.updatelabour(l);
		
		if(i>0)
		{
			//home.jsp...
		req.getRequestDispatcher("display").forward(req, resp);
		}
		
	}
}
