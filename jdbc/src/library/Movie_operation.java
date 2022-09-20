package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Movie_operation {
	Connection c;
	public Movie_operation()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	Scanner sc = new Scanner(System.in);
	
	public void addmovie()
	{
		System.out.println("enter id: ");
		int id = sc.nextInt();
		
		System.out.println("enter name: ");
		String name = sc.next();
		
		System.out.println("enter release: ");
		int release = sc.nextInt();
		
		System.out.println("enter expense: ");
		String expense = sc.next();
		
		try {
			PreparedStatement p  = c.prepareStatement("insert into movie values(?,?,?,?)");
			p.setInt(1, id);
	        p.setString(2, name);
	        p.setInt(3, release);
	        p.setString(4, expense);

	        int a = p.executeUpdate();
	        if(a>0)
	        {
	        	System.out.println("inserted succesfully...");
	        }
           c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void viewmovie() {

		try {
			PreparedStatement p = c.prepareStatement("select * from movie");
			ResultSet r = p.executeQuery();
			while(r.next())
			{
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getString(4));
			}
			c.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	public void deletemovie() {
		System.out.println("enter name: ");
		String name = sc.next();
		
		try {
			PreparedStatement p = c.prepareStatement("select * from movie where name = ?");
			p.setString(1, name);
			ResultSet r = p.executeQuery();
			if(r.next())
			{
				int b = p.executeUpdate("delete from movie where name = '"+name+"'");
				System.out.println("deleted succesfully...");
			}
			else
			{
				System.out.println("book not found...");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	public void issuemovie() {
		System.out.println("enter name: ");
		String name = sc.next();
		
		try {
			PreparedStatement p = c.prepareStatement("select * from movie where name = ?");
			p.setString(1, name);
			ResultSet r = p.executeQuery();
			if(r.next())
			{
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getString(4));
			}
			else
			{
				System.out.println("book not available right now....");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
