package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration_Servlet extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         String uname = req.getParameter("uname");
         String email = req.getParameter("email");
         String pass = req.getParameter("pass");
         
        // System.out.println(uname+" "+email+" "+pass);
         PrintWriter pw = resp.getWriter();
         pw.print(uname);
         pw.print(email);
         pw.print(pass);
}
}
