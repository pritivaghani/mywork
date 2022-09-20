package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fruit_operation {
	Connection c;
	
        public Fruit_operation()
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
	
	public void addfruit()
	{
	System.out.println("enter id: ");
	int id = sc.nextInt();
	
	System.out.println("enter name: ");
	String name = sc.next();
	
	System.out.println("enter price: ");
	int price = sc.nextInt();
	
	System.out.println("enter qty: ");
	int qty = sc.nextInt();
	
	try {
		PreparedStatement p1 = c.prepareStatement("select * from fruit where name = ?");
		p1.setString(1, name);
		ResultSet r = p1.executeQuery();
		if(r.next())
		{
			System.out.println(" book already exit....");
		}
		else
		{

			PreparedStatement p = c.prepareStatement("insert into fruit values(?,?,?,?)");
			p.setInt(1, id);
			p.setString(2, name);
			p.setInt(3, price);
			p.setInt(4, qty);
			int a = p.executeUpdate();
			if(a>0)
			{
				System.out.println("inserted successfully....");
			}
		}
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
			}

	public void viewfruit() {
		try {
			PreparedStatement p = c.prepareStatement("select * from fruit");
			ResultSet r = p.executeQuery();
			while(r.next())
			{
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public void deletefruit() {

		System.out.println("enter name: ");
		String name = sc.next();
		
		try {
			PreparedStatement p = c.prepareStatement("select * from fruit where name = ?");
			p.setString(1, name);
			ResultSet r = p.executeQuery();
			if(r.next())
			{
				int a = p.executeUpdate("delete from fruit where name = '"+name+"'");
				System.out.println("deleted succesfully..");
			}
			else
			{
				System.out.println("book not found...");
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

	public void issuefruit() {

            System.out.println("enter name: ");
            String name = sc.next();
            
            try {
				PreparedStatement p = c.prepareStatement("select * from fruit where name = ?");
				p.setString(1, name);
				ResultSet r = p.executeQuery();
				if(r.next())
				{
					int qty = r.getInt(4);
					if(qty>0)
					{
						qty--;
						PreparedStatement p1 = c.prepareStatement("update fruit set qty = ? where name = ?");
						p1.setInt(1, qty);
						p1.setString(2, name);
                     
						int a = p1.executeUpdate();
						if(a>0)
						{
							System.out.println("fruit issued....");
						}
					}
				}
				else
				{
					System.out.println("book isnot available right now...");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
            
	}
	
	
	
}
