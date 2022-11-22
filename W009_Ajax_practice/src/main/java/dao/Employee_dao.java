package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Employee;

public class Employee_dao {

	Connection c;
	
	public Employee_dao()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	public int addemployee(Employee e) {

		int i = 0;
		 try {
			PreparedStatement p = c.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
		    p.setInt(1, 0);
			p.setString(2, e.getEname());
		    p.setString(3, e.getEmail());
		    p.setString(4, e.getPass());
		    p.setString(5, e.getGender());
		    p.setString(6, e.getQua());
		    p.setString(7, e.getCountry());
		  i = p.executeUpdate();
		  
		 
		 }
		 catch (SQLException e1) {
			e1.printStackTrace();
		}
		 
		return i;
	}

	public ArrayList<Employee> getallemployee() {

		ArrayList<Employee> al = new ArrayList<>();
		
		try {
			PreparedStatement p = c.prepareStatement("select * from employee");
			
			ResultSet r = p.executeQuery();
			while(r.next())
			{
				Employee e = new Employee();
				e.setId(r.getInt(1));
				e.setEname(r.getString("ename"));
				e.setEmail(r.getString("email"));
				e.setPass(r.getString("pass"));
				e.setGender(r.getString("gender"));
				e.setQua(r.getString("qualification"));
				e.setCountry(r.getString("country"));
			
			al.add(e);
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return al;
	}

	public int deleteemployee(int eid) {

		int i = 0;
		try {
			PreparedStatement p = c.prepareStatement("delete from employee where eid=?");
	p.setInt(1, eid);
		
	i = p.executeUpdate();
	
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return i;
	}

	public Employee getemployeebyid(int eid) {

		Employee e = new Employee();
		
		try {
			PreparedStatement p = c.prepareStatement("select * from employee where eid=?");
		p.setInt(1, eid);
		 
		ResultSet r = p.executeQuery();
		if(r.next())
		{
			e.setId(r.getInt(1));
			e.setEname(r.getString("ename"));
			e.setEmail(r.getString("email"));
			e.setPass(r.getString("pass"));
			e.setGender(r.getString("gender"));
			e.setQua(r.getString("qualification"));
			e.setCountry(r.getString("country"));
		}
		
		} 
		catch (SQLException e1) {			
			e1.printStackTrace();
		}
		
		
		
		return e;
	}

	public int updateemployee(Employee e) {

		int i = 0;
		try {
			PreparedStatement p = c.prepareStatement("update employee set ename=?,email=?,pass=?,gender=?,qualification=?,country=? where eid=?");
		p.setInt(7, e.getId());
		p.setString(1, e.getEname());
		p.setString(2, e.getEmail());
		p.setString(3, e.getPass());
		p.setString(4, e.getGender());
		p.setString(5, e.getQua());
		p.setString(6, e.getCountry());
		
		i = p.executeUpdate();
		
		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return i;
	}
	
	
	
	
	
}
