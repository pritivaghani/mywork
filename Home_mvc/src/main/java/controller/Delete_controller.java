package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Labour_dao;

@WebServlet("/delete")
public class Delete_controller extends HttpServlet 
{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  int did = Integer.parseInt(req.getParameter("did"));
	  
	  Labour_dao d = new Labour_dao();
	  int i = d.deletelabour(did);
	  
	  if(i>0)
	  {
		  req.getRequestDispatcher("display").forward(req, resp);
	  }
	  
	  
}
}
