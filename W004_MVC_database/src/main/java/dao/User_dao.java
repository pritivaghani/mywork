package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;
public class User_dao {

	Connection c;
	
	public User_dao()
	  {
		  try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	  }
	
	
	public int addUser(User u) {
		int i=0;
		try {
			PreparedStatement p = c.prepareStatement("insert into user values(?,?,?,?)");
			p.setInt(1, 0);
			p.setString(2, u.getUname());
			p.setString(3, u.getEmail());
			p.setString(4, u.getPass());
			
			 i = p.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return i;
	}


	public boolean logincheck(User u)
	{
	
	boolean b = false;
	 try{
		PreparedStatement p = c.prepareStatement("select * from user where email=? and pass=?");
		p.setString(1, u.getEmail());
		p.setString(2, u.getPass());
		
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


	public ArrayList<User> getalluser() {
    
		ArrayList<User> al = new ArrayList<>();
		
		PreparedStatement p;
		try {
			p = c.prepareStatement("select * from user");
			ResultSet r;

			r = p.executeQuery();
           while(r.next())
           {
        	   User u = new User();
        	   u.setId(r.getInt(1));
        	   u.setUname(r.getString(2));
        	   u.setEmail(r.getString(3));
        	   u.setPass(r.getString(4));
        	   
        	   al.add(u);           }
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
			
		return al;
	}


	public int deleteuser(int did) {
		
		int i = 0;
		try {
			PreparedStatement p = c.prepareStatement("delete from user where id=?");
			p.setInt(1, did);
			
			i= p.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return i;
	}

}
