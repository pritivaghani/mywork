package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Model.Student;
import dao.Student_dao;

/**
 * Servlet implementation class Search_controller
 */
@WebServlet("/search")
public class Search_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Search_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String value = request.getParameter("value");
		
		PrintWriter p = response.getWriter();
		
		Student_dao d = new Student_dao();
		ArrayList<Student> al = d.searchstudent(value);
		Gson g = new Gson();
		String s = g.toJson(al);
		p.append(s);
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
