package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Second_connection {

	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/16june";
			String username = "root";
			String password = "";
			
		Connection c = DriverManager.getConnection(url, username, password);
		
		Statement s = c.createStatement();
		
		//ResultSet r = s.executeQuery("select ct.ctname , s.sname, c.cname from city ct join state s join country c on ct.sid = s.sid and s.cid = c.cid");
		ResultSet r = s.executeQuery("select * from publication");
		
		while(r.next())
		{
			int pid = r.getInt(1);
			String pname = r.getString("pname");
			String adr = r.getString("adr");
			
			System.out.println(pid+" "+pname+" "+adr);
//		String ctname = r.getString("ctname");
//		String sname = r.getString("sname");
//		String cname = r.getString("cname");
//		System.out.println(ctname+" "+sname+" "+cname);
		}
		
		c.close();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
