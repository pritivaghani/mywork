package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Labour_dao;
import model.labour;

         //for display.jsp....

@WebServlet("/update")
public class Update_controller extends HttpServlet

{
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int lid = Integer.parseInt(req.getParameter("lid"));
		
	   Labour_dao  d = new Labour_dao();
	   
	   labour l = d.getlabourbyid(lid);
	   
	 req.setAttribute("labour", l);
	 req.getRequestDispatcher("Update.jsp").forward(req, resp);
	
	}
}
