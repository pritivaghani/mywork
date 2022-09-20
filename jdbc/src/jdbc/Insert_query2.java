package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_query2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id: ");
		int aid = sc.nextInt();
		
		System.out.println("enter name: ");
		String aname = sc.next();
		
		System.out.println("enter qualification: ");
		String qualification = sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june", "root","");
			Statement s = c.createStatement();
			int a = s.executeUpdate("insert into author(aid, aname,qualification)" + " values("+aid+", '"+aname+"', '"+qualification+"')");
			
			if(a>0)
			{
				System.out.println("data inserted...");
			}
			
			c.close();
			
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
		

	}

}
