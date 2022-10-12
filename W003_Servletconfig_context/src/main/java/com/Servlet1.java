package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
	   resp.setContentType("text/html");
      PrintWriter p = resp.getWriter();
      p.write("<h1>welcome Servlet1</h1>");
     
      
      ServletContext sc = req.getServletContext();
      String driver = sc.getInitParameter("driver");
      p.write("<h1>driver : "+driver+"</h1>");

      ServletConfig config = getServletConfig();
      String path = config.getInitParameter("Path");
      p.write("<h1>path is : "+path+"</h1>");
   }
}
