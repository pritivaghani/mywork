package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Boy_dao;
import model.Boy;

@WebServlet("/reg")
public class Registration_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String bname = request.getParameter("bname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		Boy b = new Boy();
		if(!id.equals(""))
		{
			b.setId(Integer.parseInt(id));
		}
		b.setBname(bname);
		b.setEmail(email);
		b.setPass(pass);
		
		
		Boy_dao d = new Boy_dao();
		d.addboy(b);
		
	}
	
	

}
