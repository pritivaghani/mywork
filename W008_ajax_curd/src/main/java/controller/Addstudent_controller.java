package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Student;
import dao.Student_dao;


@WebServlet("/reg")
public class Addstudent_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//update
		
		PrintWriter p = response.getWriter();
		
		Student s = new Student();
		s.setId(Integer.parseInt(request.getParameter("sid")));
		s.setSname(request.getParameter("sname"));
		s.setEmail(request.getParameter("email"));
		s.setPass(request.getParameter("pass"));
		s.setDob(request.getParameter("dob"));
		s.setCountry(request.getParameter("country"));
		
		Student_dao d = new Student_dao();
		int i = d.updatestudent(s);
		
		if(i>0)
		{
			p.append("Student updated successfully....");
			
		}
	
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		//insert
		
		PrintWriter p = response.getWriter();
		
		Student s = new Student();
		s.setSname(request.getParameter("sname"));
		s.setEmail(request.getParameter("email"));
		s.setPass(request.getParameter("pass"));
		s.setDob(request.getParameter("dob"));
		s.setCountry(request.getParameter("country"));
		
		Student_dao d = new Student_dao();
		int i = d.addstudent(s);
		
		if(i>0)
		{
			p.append("Student added successfully....");
			
		}
	}

}
