package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Library_operation {
     Connection c;
	public Library_operation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void addbook()
	{
		System.out.println("enter book name: ");
		String bname = sc.next();
		System.out.println("enter price: ");
		Double price = sc.nextDouble();
		System.out.println("enter qty: ");
		int qty = sc.nextInt();
		
		try {
			PreparedStatement p = c.prepareStatement("insert into library values(?,?,?,?)");
			p.setInt(1, 0);
			p.setString(2, bname);
			p.setDouble(3,price);
			p.setInt(4, qty);
			
			int a = p.executeUpdate();
			
			if(a>0)
			{
				System.out.println("inserted sucessfully...");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void viewbook() {
		
		
	}

	public void deletebook() {
	
		
	}

	public void issuebook() {
		
		
	}
}
