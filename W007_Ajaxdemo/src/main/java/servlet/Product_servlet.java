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


@WebServlet("/product")
public class Product_servlet extends HttpServlet {
	
    public Product_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter p = response.getWriter();
		String pname = request.getParameter("pname");
		//p.print(pname);
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
			
			Statement s = c.createStatement();
			ResultSet r = s.executeQuery("select * from product where pname like '"+pname+"%'");
			
			p.append("<ul>");
			
			while(r.next())
			{
				p.append("<li>"+r.getString(2)+"</li>");
			}
			
			p.append("/<ul>");
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	

}
