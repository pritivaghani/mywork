package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login_servlet extends HttpServlet
{
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
       String uname = req.getParameter("uname");
       String pass = req.getParameter("pass");
       
      // System.out.println(uname+" "+pass);
      PrintWriter pw = resp.getWriter();
      pw.print("<h1>uname : "+uname+"</h1>");
      pw.print("<h1>pass : "+pass+"</h1>");
     
     }
}
