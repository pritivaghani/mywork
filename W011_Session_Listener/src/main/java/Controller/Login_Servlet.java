package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Login_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter p = response.getWriter();
		
		String email = request.getParameter("email");
		String pass= request.getParameter("pass");
		
		if(email.equals("admin") && pass.equals("admin"))
		{
			HttpSession s = request.getSession();
			s.setAttribute("email", email);
			
			ServletContext sc = request.getServletContext();
			int currentuser = (int) sc.getAttribute("cu");
			int totaluser = (int) sc.getAttribute("tu");
			
			p.print("<h1>current user : "+currentuser+"</h1>");
			p.print("<h1>total user : "+totaluser+"</h1>");
			
			p.print("<a href='logout'>Logout</a>");
			
		}
		else
		{
			request.getRequestDispatcher("Index.jsp").forward(request, response);
		}
		
	
	}

	

}
