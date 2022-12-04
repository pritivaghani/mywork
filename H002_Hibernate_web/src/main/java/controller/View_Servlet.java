package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Boy_dao;

@WebServlet("/view")
public class View_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public View_Servlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	Boy_dao  b = new Boy_dao();
	
	request.setAttribute("data", b.viewboy());
	request.getRequestDispatcher("View.jsp").forward(request, response);
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	
	}

}
