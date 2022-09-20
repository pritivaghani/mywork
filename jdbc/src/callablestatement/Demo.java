package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june","root","");
			
			CallableStatement cs = connection.prepareCall("call allemp()");
			ResultSet r = cs.executeQuery();
			while(r.next())
			{
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4)+" "+r.getInt(5));
			}
			
		} 
		catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
		

	}

}
