package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Fruit_dao;
import model.Fruit;

@WebServlet("/view")
public class View_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public View_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	Fruit_dao d = new Fruit_dao();
	
	request.setAttribute("data", d.viewfruit());
	request.getRequestDispatcher("View.jsp").forward(request, response);
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
