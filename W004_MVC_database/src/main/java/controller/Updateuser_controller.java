package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_dao;
import model.User;

@WebServlet("/updateuser")
public class Updateuser_controller extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 int uid = Integer.parseInt(req.getParameter("uid"));
	 String uname = req.getParameter("uname");
	 String email = req.getParameter("email");
	 String pass = req.getParameter("pass");
	 
	 User u = new User();
	 u.setId(uid);
	 u.setUname(uname);
	 u.setEmail(email);
     u.setPass(pass);
     
     User_dao d = new User_dao();
     int i = d.updateuser(u);
     
     if(i>0)
     {
    	 req.getRequestDispatcher("display").forward(req, resp);
     }
 }
	

}
