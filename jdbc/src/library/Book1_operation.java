package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Book1_operation {
    Connection c;
  public Book1_operation()
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
  
	public void addbook()
	{
		System.out.println("enter id: ");
		int id = sc.nextInt();
		
		System.out.println("enter name: ");
		String name = sc.next();
		
		System.out.println("enter price: ");
		double price = sc.nextDouble();
		
		System.out.println("enter qty: ");
		int qty = sc.nextInt();
		
		try {
			PreparedStatement p1 = c.prepareStatement("select * from book1 where name = ?");
			p1.setString(1, name);
			
				ResultSet r = p1.executeQuery();
				if(r.next())
				{
					System.out.println("book already exit...");
				}
				else
				{
					PreparedStatement p = c.prepareStatement("insert into book1 values(?,?,?,?)");
					p.setInt(1,0);
					p.setString(2, name);
					p.setDouble(3, price);
		            p.setInt(4, qty);
		            
		            int a = p.executeUpdate();
		            if(a>0)
		            {
		            	System.out.println("inserted sucessfully");
		            }
		            c.close();
				}
		} 
		catch (SQLException e) {
						e.printStackTrace();
		}
			
	}

	public void deletebook() {
		
//		System.out.println("enter book name: ");
//		String name = sc.next();
//		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
//			PreparedStatement p = c.prepareStatement("select * from book1 where name = ?");
//			p.setString(1, name);
//			ResultSet r = p.executeQuery();
//			if(r.next())
//			{
//				int a = p.executeUpdate("delete from book1 where name = '"+name+"'");
//				System.out.println(" book deleted");
//				
//			}
//			else
//			{
//				System.out.println(" book not found....");
//			}
//		} 
//		catch (ClassNotFoundException | SQLException e) {
//		
//			e.printStackTrace();
//		}
//		
//		
		System.out.println("enter book name: ");
		String name = sc.next();
       try {
          PreparedStatement p = c.prepareStatement("select * from book1 where name = ?");
          p.setString(1, name);
          ResultSet r = p.executeQuery();
          if(r.next())
          {
        	 int a = p.executeUpdate("delete from book1 where name = '"+name+"'");
        	 System.out.println("book deleted...");
          }
          else
          {
        	  System.out.println("book not founded....");
          }
       } 
       catch (SQLException e) {
		e.printStackTrace();
	}
       
		
	}

	public void issuebook() {
		System.out.println(" enter book name: ");
		String name = sc.next();
		
		try {
			PreparedStatement p = c.prepareStatement("select * from book1 where name = ?");
			p.setString(1, name);
			ResultSet r = p.executeQuery();
			if(r.next())
			{
				int qty = r.getInt(4);
				if(qty>0)
				{
					qty--;
					PreparedStatement p1 = c.prepareStatement("update book1 set qty = ? where name = ?");
					p1.setInt(1, qty);
					p1.setString(2, name);
					
					int a = p1.executeUpdate();
					if(a>0)
					{
						System.out.println("book issued...");
					}
				}
				
			}
			else
			{
				System.out.println(" book is not available right now....");
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
			
		
		
	}
	
	public void viewbook() {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
//			Statement s = c.createStatement();
//			ResultSet r = s.executeQuery("select * from book1");
//			while(r.next())
//			{
//				int id = r.getInt(1);
//				String name = r.getString(2);
//				double price = r.getDouble(3);
//				int qty = r.getInt(4);
//				
//				System.out.println(id+" "+name+" "+price+" "+qty);
//			}
//			c.close();
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
		
		
		try {
			PreparedStatement p = c.prepareStatement("select * from book1");
			ResultSet r = p.executeQuery();
			while(r.next())
			{
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getDouble(3)+" "+r.getInt(4));
			}
			c.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
