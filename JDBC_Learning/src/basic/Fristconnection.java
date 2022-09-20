package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fristconnection {

	public static void main(String[] args) {
		
		try {
			// step - 1 load the driver 
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connected...");
			
			// step - 2 define connection url
			//String url ="jdbc:mysql://localhost:3306/16june";
			//String username = "root";
			//String password = "";
			
			//step - 3 established connection 
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
			
			// step - 4 create statement 
			Statement s = cn.createStatement();
			
			// step - 5 execute query 
			ResultSet r = s.executeQuery("select * from emp");
			
			// step - 6 process result set
			while(r.next())
			{
				int id = r.getInt(1);
				String name = r.getString(2);
			 String email = r.getString(3);
			 String dept = r.getString(4);
			 String sal = r.getString("sal");
			 
			 System.out.println(id+" "+name+" "+email+" "+dept+" "+sal);
			}
			// step - 7 close connection
			cn.close();
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
	}

}
