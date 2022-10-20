package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_dao;

@WebServlet("/delete")
public class Delete_controller extends HttpServlet
{
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
    	    int did = Integer.parseInt(req.getParameter("did"));
    	    
    	    User_dao u = new User_dao();
    	    int i = u.deleteuser(did);
    	    
    	    if(i>0)
    	    {
    	    	req.getRequestDispatcher("display").forward(req, resp);
    	    }
       
       
       }
}
