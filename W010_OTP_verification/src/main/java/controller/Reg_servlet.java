package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import email.Email_sending;

 
@WebServlet("/reg")
public class Reg_servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if(email.equals("admin@gmail.com") && pass.equals("admin"))
		{
			Random r = new Random();
			int otp = r.nextInt(9999);
			
			//System.out.println("your otp is : "+otp);
			
			Email_sending.send(email, otp+"");
			
			ServletContext sc = request.getServletContext();
			sc.setAttribute("myotp", otp);
			
			
			request.getRequestDispatcher("OTP.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("err", "Invalid email and password");
			request.getRequestDispatcher("Index.jsp").forward(request, response);
		}
	
	
	
	}

	
}
