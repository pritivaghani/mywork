package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Fruit_dao;

@WebServlet("/update")
public class Update_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Update_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("fid"));
		String action = request.getParameter("action");
		
		Fruit_dao d = new Fruit_dao();
		
		if(action.equals("delete"))
		{
	  d.deletefruit(id);
	  request.getRequestDispatcher("view").forward(request, response);
		}
		else if(action.equals("update"))
		{
	request.setAttribute("data", d.getfruitbyid(id));
	request.getRequestDispatcher("Index.jsp").forward(request, response);
	}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
