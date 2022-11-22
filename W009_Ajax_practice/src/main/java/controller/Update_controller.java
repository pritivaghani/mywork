package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.Employee_dao;
import model.Employee;


@WebServlet("/update")
public class Update_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Update_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	Employee_dao d = new Employee_dao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter p = response.getWriter();
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		
		Employee e = d.getemployeebyid(eid);
		Gson g = new Gson();
		p.append(g.toJson(e));
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter p = response.getWriter();
	
	int eid = Integer.parseInt(request.getParameter("eid"));
	
	int i = d.deleteemployee(eid);
	if(i>0)
	{
		p.append("deleted successfully!!!!");
		
	}
	
	}

}
