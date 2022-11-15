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


@WebServlet("/view")
public class View_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public View_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  PrintWriter p = response.getWriter();
	  
	  Student_dao d = new Student_dao();
	  ArrayList<Student> al = d.getallstudent();
	  Gson g = new Gson();
	  String s = g.toJson(al);
	  p.append(s);
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
