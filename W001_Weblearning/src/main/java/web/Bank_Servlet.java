package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Bank_Servlet extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

             String bname = req.getParameter("bname");
             String num = req.getParameter("num");
             String code = req.getParameter("code");
             
             
             //System.out.println(bname+" "+num+" "+code);
PrintWriter pw = resp.getWriter();
      pw.print(bname);
       pw.print(num);
        pw.print(code);

}
	
}
