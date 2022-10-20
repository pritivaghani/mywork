package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_dao;
import model.User;

@WebServlet("/update")
public class Update_controller extends HttpServlet 
{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   int uid = Integer.parseInt(req.getParameter("uid"));
   
   User_dao d = new User_dao();
   
   User u = d.getuserbyid(uid);
   
   req.setAttribute("user", u);
   req.getRequestDispatcher("Update.jsp").forward(req, resp);  
  
  }
}
