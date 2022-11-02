package dao;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Notebook;

public class Notebook_dao {

	Connection c;
	
	 public Notebook_dao()
	 {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
		} 
		 catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		 
	 }
	 
	 
	 public ArrayList<Notebook> getallnotebook()
	 {
		 ArrayList<Notebook> al = new ArrayList<>();
		 
		 try {
			PreparedStatement p = c.prepareStatement("select * from notebook");
          ResultSet r = p.executeQuery();
          while(r.next())
          {
        	  Notebook n = new Notebook();
        	  n.setId(r.getInt(1));
        	  n.setBname(r.getString(2));
        	  n.setPrice(r.getDouble(3));
        	  
        	  al.add(n);
        	  
          }
		 } 
		 catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 
		 return al;
	 }
	 
	 public int addnotebook(Notebook n)
	 {
		 int i = 0;
		 
		 try {
			PreparedStatement p = c.prepareStatement("insert into notebook values(?,?,?)");
	  p.setInt(1, 0);
	  p.setString(2, n.getBname());
	  p.setDouble(3, n.getPrice() );;
		 
       i = p.executeUpdate();	  
		 
		 } 
		 catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 return i;
	 }
	 
	 public Notebook getnotebookbyid(int id)
	 {
		 Notebook n = new Notebook();
		 
		 try {
			PreparedStatement p = c.prepareStatement("select * from notebook where id=?");
			p.setInt(1, 0);
			
			ResultSet r = p.executeQuery();
			if(r.next())
			{
				n.setId(r.getInt(1));
				n.setBname(r.getString(2));
				n.setPrice(r.getDouble(3));
			}
		} 
		 catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 
		 return n;
		 
	 }
	 
	 public int deletenotebook(int id)
	 {
        int i = 0;

		 try {
			PreparedStatement p = c.prepareStatement("delete from notebook where id=?");
			p.setInt(1, 0);
			
           i = p.executeUpdate();
} 
		 catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 return i;
		 
	 }
	 
	 public int updatenotebook(Notebook n)
	 {
		 int i = 0;
		 
		 try {
			PreparedStatement p = c.prepareStatement("update notebook set email=?, price=? where id=?");
		p.setInt(3, n.getId());
		p.setString(1, n.getBname());
		p.setDouble(2, n.getPrice());
		 
		 i = p.executeUpdate();
		 
		 }
		 catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 return i;
		 
	 }
	 
	 public boolean isnotebookexit(Notebook n)
	 {
		 boolean b = false;
		 
		 try {
			PreparedStatement p = c.prepareStatement("select * from notebook where bname=?");
	           p.setString(1, n.getBname());
	           
	           ResultSet r = p.executeQuery();
	           if(r.next())
	           {
	        	   b = true;
	           }
		 
		 
		 } 
		 catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 return b;
	 }
}
