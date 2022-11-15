package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Student;

public class Student_dao {

	Connection c;
	
	public Student_dao()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	public int addstudent(Student s) {
		
		int i = 0;
		
		try {
			PreparedStatement p = c.prepareStatement("insert into student(sid,sname,email,pass,dob,country) values(?,?,?,?,?,?)");
			p.setInt(1, 0);
			p.setString(2, s.getSname());
			p.setString(3, s.getEmail());
			p.setString(4, s.getPass());
			p.setString(5, s.getDob());
			p.setString(6, s.getCountry());
			
			i = p.executeUpdate();
			
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
				
		
		
		return i;
	}

	public ArrayList<Student> getallstudent() {

		ArrayList<Student> al = new ArrayList<>();
		
		try {
			PreparedStatement p = c.prepareStatement("select * from student");
			
			ResultSet r = p.executeQuery();
			while(r.next())
			{
				Student s = new Student();
				s.setId(r.getInt(1));
				s.setSname(r.getString("sname"));
				s.setEmail(r.getString("email"));
				s.setPass(r.getString("pass"));
				s.setDob(r.getString("dob"));
				s.setCountry(r.getString("country"));
				
				al.add(s);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return al;
	}

	public int deletestudent(int sid) {
 int i = 0;
    try {
		PreparedStatement p = c.prepareStatement("delete from student where sid=?");
		p.setInt(1, sid);
		
		i = p.executeUpdate();
		
	}
    catch (SQLException e) {		
		e.printStackTrace();
	}
    
		
		return i;
	}

	public Student getstudentbyid(int sid) {

		Student s = new Student();
		
		try {
			PreparedStatement p = c.prepareStatement("select * from student where sid=?");
		p.setInt(1, sid);
		
		ResultSet r = p.executeQuery();
		if(r.next())
		{
			s.setId(r.getInt(1));
			s.setSname(r.getString("sname"));
			s.setEmail(r.getString("email"));
			s.setPass(r.getString("pass"));
			s.setDob(r.getString("dob"));
			s.setCountry(r.getString("country"));
		}
		
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		 return s;
	}

	public int updatestudent(Student s) {

		int i = 0;
		
		try {
			PreparedStatement p = c.prepareStatement("update student set sname=?,email=?,pass=?,dob=?,country=? where sid=?");
		    p.setInt(6, s.getId());
			p.setString(1, s.getSname());
			p.setString(2, s.getEmail());
			p.setString(3, s.getPass());
			p.setString(4, s.getDob());
			p.setString(5, s.getCountry());
			
			i = p.executeUpdate();
			
		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		 return i;

	}

	public ArrayList<Student> searchstudent(String value) {

     ArrayList<Student> al = new ArrayList<>();
		
		try {
			PreparedStatement p = c.prepareStatement("select * from student where sname like ?");
			p.setString(1, value+"%");
			ResultSet r = p.executeQuery();
			while(r.next())
			{
				Student s = new Student();
				s.setId(r.getInt(1));
				s.setSname(r.getString("sname"));
				s.setEmail(r.getString("email"));
				s.setPass(r.getString("pass"));
				s.setDob(r.getString("dob"));
				s.setCountry(r.getString("country"));
				
				al.add(s);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return al;
	
	}

	
	
}
