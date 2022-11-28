package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.file_model;

public class File_dao {

	Connection c;
	
	public File_dao()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/16june" , "root","");
		
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	public int addfilename(file_model f) {
		
		int i = 0;
		
		PreparedStatement p ;
		
		
		return i;
	}
}
