package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_query {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id: ");
		int id = sc.nextInt();
		
		System.out.println("enter name: ");
		String name = sc.next();
		
		System.out.println("enter email: ");
		String email = sc.next();
		
		System.out.println("enter subject: ");
		String subject = sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
			Statement s = c.createStatement();
			int a = s.executeUpdate("insert into student(id,name,email,subject)" + " values("+id+",'"+name+"','"+email+"','"+subject+"')");
			
			if(a>0)
			{
				System.out.println("data is inserted..");
			}
			c.close();
			
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
