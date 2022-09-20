package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete_query {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id: ");
		int id = sc.nextInt();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
			Statement s = c.createStatement();
			
			int a = s.executeUpdate("delete from student where id = "+id+"");
			
			if(a>0)
			{
				System.out.println("data successfully deleted...");
			}
			
			c.close();
		}
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
