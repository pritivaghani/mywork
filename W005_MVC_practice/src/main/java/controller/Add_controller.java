package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Notebook_dao;
import model.Notebook;

@WebServlet("/reg")
public class Add_controller  extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bname = req.getParameter("bname");
		String price = req.getParameter("price");
		
		Notebook n = new Notebook();
		n.setBname(bname);
		n.setPrice(Double.parseDouble(price));
		
		
		Notebook_dao d = new Notebook_dao();
		int i = d.addnotebook(n);
		if(i>0)
		{
			req.setAttribute("msg", "added successfully");
			req.getRequestDispatcher("Index.jsp").forward(req, resp);
		}
	}
}
