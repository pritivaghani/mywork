package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Registration_servlet extends HttpServlet

{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	   String uname = req.getParameter("uname");
	     String email = req.getParameter("email");
	     String pass = req.getParameter("pass");
	     
	     resp.setContentType("text/html");
	     //System.out.println(uname+" "+email+" "+pass);
	     try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
			
			PreparedStatement p = c.prepareStatement("insert into user values(?,?,?,?)");
			p.setInt(1, 0);
			p.setString(2, uname);
			p.setString(3, email);
			p.setString(4, pass);
			int a = p.executeUpdate();
			if(a>0)
			{
				//System.out.println("inserted successfully....");
				req.setAttribute("msg", "data added successfully!!!");
			//PrintWriter pw = resp.getWriter();
			//pw.write("data inserted");
	  req.getRequestDispatcher("Reg1.jsp").forward(req, resp);
		//req.getRequestDispatcher("Reg1.jsp").include(req, resp);	
			//resp.sendRedirect("Reg1.jsp");
			}
			
		} 
	     catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	     
	   
	   }
   
   
   
   }

    
	
	
	

