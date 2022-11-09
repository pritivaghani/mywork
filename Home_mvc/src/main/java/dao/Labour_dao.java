package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.labour;

public class Labour_dao {

	Connection c;
	public Labour_dao()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	public int addlabour(labour u) {
		
		int i = 0;
		
		try {
			PreparedStatement p = c.prepareStatement("insert into labour values(?,?,?,?)");
			p.setInt(1, 0);
			p.setString(2, u.getLname());
           p.setString(3, u.getEmail());
           p.setString(4, u.getPass());
           
           i = p.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
				return i;
	}



	public boolean logincheck(labour l) {
        boolean i = false;
        try {
			PreparedStatement p = c.prepareStatement("select * from labour where email=? and pass=?");
			p.setString(1,l.getEmail());
			p.setString(2, l.getPass());
			
			ResultSet r = p.executeQuery();
			if(r.next())
			{
				i = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
		
		
		return i;
	}



	public ArrayList<labour> getalllabour() {
    ArrayList<labour> al = new ArrayList<>();
    
    try {
		PreparedStatement p = c.prepareStatement("select * from labour");
		ResultSet r = p.executeQuery();
		while(r.next())
		{
			labour l = new labour();
			l.setId(r.getInt(1));
			l.setLname(r.getString(2));
			l.setEmail(r.getString(3));
			l.setPass(r.getString(4));
			
			al.add(l);
			
		}
		
	
	} 
    catch (SQLException e) {
		e.printStackTrace();
	}
    
		
		
		return al;
	}
	
	
}
