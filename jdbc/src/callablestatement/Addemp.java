package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Addemp {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
			CallableStatement ca = c.prepareCall("call addemp(?,?,?,?,?)");
			ca.setInt(1, 0);
			ca.setString(2,"priti");
			ca.setString(3, "priti@gmail.com");
			ca.setString(4, "java");
			ca.setDouble(5, 50000);
			
			ca.execute();
			
//			int a = ca.executeUpdate();
//			if(a>0)
//			{
//				System.out.println("added succesfully...");
//			}
			
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
