package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Frist_connection {
	public static void main(String[] args) {
		
		try {
			//step - 1 load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connected...");
			
			//step - 2 define connection url
			String url = "jdbc:mysql://localhost:3306/16june";
			String username = "root";
			String password = "";
			
			//step - 3 established connection
			Connection c = DriverManager.getConnection(url, username, password);
			
			// step - 4 create statement
			Statement s = c.createStatement();
			
			//step -5 execute query
			ResultSet r = s.executeQuery("select * from emp");
			
			//step - 6 process result
			while(r.next())
			{
				int id = r.getInt(1);
				String name = r.getString(2);
			 String email = r.getString(3);
			 String dept = r.getString(4);
			 double sal = r.getDouble("sal");
			 
			 System.out.println(id+" "+name+" "+email+" "+dept+" "+sal);
			}
			
			// step - 7 close connection
			c.close();
			
			
			
			} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
