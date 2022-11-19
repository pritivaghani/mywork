package controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/otp")
public class OTP_verification_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int otp = Integer.parseInt(request.getParameter("otp"));
	
	ServletContext sc = request.getServletContext();
	int myotp = (int) sc.getAttribute("myotp");
	
	if(otp==myotp)
	{
		request.getRequestDispatcher("Home.jsp").forward(request, response);	
		}
	else
	{
		request.setAttribute("err", "Invalid otp");
		request.getRequestDispatcher("Index.jsp").forward(request, response);
	}
	
	
	
	}



}
