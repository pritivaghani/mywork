package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employee_dao;
import model.Employee;


@WebServlet("/reg")
public class Addemployee_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Addemployee_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter p = response.getWriter();
		
		Employee e = new Employee();
		e.setEname(request.getParameter("ename"));
		e.setEmail(request.getParameter("email"));
		e.setPass(request.getParameter("pass"));
	    e.setGender(request.getParameter("gender")); 
	    e.setQua(request.getParameter("qua"));
	    e.setCountry(request.getParameter("country"));
	    
	    Employee_dao d = new Employee_dao();
	    int i = d.addemployee(e);
	    if(i>0)
	    {
	    	p.append("Employee added successfully!!!");
	    	
	    }
	}

}
