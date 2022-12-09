package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Fruit_dao;
import model.Fruit;


@WebServlet("/reg")
public class Registartion_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Registartion_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");
		
		Fruit f = new Fruit();
		if(!id.equals(""))
		{
			f.setId(Integer.parseInt(id));
		}
		f.setName(name);
		f.setPrice(price);
		f.setQty(qty);
		
		Fruit_dao d = new Fruit_dao();
		d.addfruit(f);
		
	}

}
