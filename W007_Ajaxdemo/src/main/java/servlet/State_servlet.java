package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/state")
public class State_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public State_servlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cid = Integer.parseInt(request.getParameter("cid"));
		PrintWriter p = response.getWriter();
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
			
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery("select * from state where cid="+cid+"");
			
			p.append("<option>---select state---</option>");
			
			while(r.next())
			{
				p.append("<option value="+r.getInt(1)+">"+r.getString(2)+"</option>");
			}
			
		
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	

}
