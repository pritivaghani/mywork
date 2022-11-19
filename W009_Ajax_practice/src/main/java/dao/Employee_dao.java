package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Employee;

public class Employee_dao {

	Connection c;
	
	public Employee_dao()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	public int addemployee(Employee e) {

		int i = 0;
		 try {
			PreparedStatement p = c.prepareStatement("insert into employee values(?,?,?,?,?,?)");
		    p.setInt(1, 0);
			p.setString(2, e.getEname());
		    p.setString(3, e.getEmail());
		    p.setString(4, e.getPass());
		    p.setString(5, e.getGender());
		    p.setString(6, e.getQua());
		    p.setString(7, e.getCountry());
		  i = p.executeUpdate();
		  
		 
		 }
		 catch (SQLException e1) {
			e1.printStackTrace();
		}
		 
		return i;
	}
	
	
	
	
	
}
