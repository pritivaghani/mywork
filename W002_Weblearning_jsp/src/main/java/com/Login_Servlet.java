package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login_Servlet extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   String uname = req.getParameter("uname");
   String pass = req.getParameter("pass");
   
   ServletContext sc = req.getServletContext();
   
   try {
	Class.forName(sc.getInitParameter("driver"));
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
	PreparedStatement p = c.prepareStatement("select * from user where uname = ? and pass = ?");
	p.setString(1, uname);
	p.setString(2, pass);
	
	ResultSet r = p.executeQuery();
	if(r.next())
	{
		//System.out.println("welcome");
		req.setAttribute("uname", r.getString(2));
		req.getRequestDispatcher("Homepage.jsp").forward(req, resp);
	}
	else
	{
		//System.out.println("invalid username and password");
		req.setAttribute("err", "inavlid username or pass");
		req.getRequestDispatcher("Login.jsp").forward(req, resp);
	}
} 
   catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
   
   
   }
}
