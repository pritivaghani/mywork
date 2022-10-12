package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	   resp.setContentType("text/html");
	      PrintWriter p = resp.getWriter();
	      p.write("<h1>welcome Servlet2</h1>");
	   
   ServletContext sc = req.getServletContext();
   String url = sc.getInitParameter("URL");
   p.write("<h1>url : "+url+"</h1>");
   
   ServletConfig c = getServletConfig();
   String path = c.getInitParameter("Path");
   p.write("<h1>path : "+path+"</h1>");
   
   }
}
