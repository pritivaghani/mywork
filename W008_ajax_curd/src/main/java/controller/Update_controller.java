package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Model.Student;
import dao.Student_dao;

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

	Student_dao d = new Student_dao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//update	
	PrintWriter p = response.getWriter();
	int sid = Integer.parseInt(request.getParameter("sid"));
     
	Student s = d.getstudentbyid(sid);
	Gson g = new Gson();
	p.append(g.toJson(s));
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//delete
	PrintWriter p = response.getWriter();
	
		int sid = Integer.parseInt(request.getParameter("sid"));
		
		int i = d.deletestudent(sid);
		
		if(i>0)
		{
			p.append("deleted succefully!!!!");
			
		}
		
	}

}
