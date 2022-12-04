package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Boy_dao;

/**
 * Servlet implementation class Update_controller
 */
@WebServlet("/update")
public class Update_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Update_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int id = Integer.parseInt(request.getParameter("bid"));
	String action = request.getParameter("action");
	
	Boy_dao d = new Boy_dao();
	
	if(action.equals("delete"))
	
	{
		d.deleteboy(id);
		request.getRequestDispatcher("view").forward(request, response);
	}
	else if(action.equals("update"))
	{
		request.setAttribute("data", d.getboybyid(id));
		request.getRequestDispatcher("Index.jsp").forward(request, response);
	}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
