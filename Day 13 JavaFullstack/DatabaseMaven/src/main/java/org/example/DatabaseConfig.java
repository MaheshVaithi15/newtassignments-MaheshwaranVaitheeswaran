package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
	
	// to setup the database connection
	
	public static Connection getConnection(){
		
		//database connection
		
		String dburl = "jdbc:mysql://localhost:3306/exampledb?useSSL=false";
		String dbname = "root";
		String dbpass = "root";
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dburl,dbname,dbpass);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();  
		}
		return con;
		
	}
	

}
