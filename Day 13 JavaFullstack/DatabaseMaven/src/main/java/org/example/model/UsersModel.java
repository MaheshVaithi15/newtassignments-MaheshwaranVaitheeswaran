package org.example.model;

import java.util.*;
import java.sql.*;

import org.example.DatabaseConfig;
import org.example.entity.User;

public class UsersModel {
	
	public List<User> listuser(){
		List<User> listusers = new ArrayList<User>();
		
		//initialize the connection object
		Connection connect = DatabaseConfig.getConnection();	
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		// creation of query and execute it
		String q = "Select * from users";
		
		try {
			stmt=connect.createStatement();
			
			// execution of query
			
			rs = stmt.executeQuery(q);
			
			while(rs.next()) {
				listusers.add(new User(rs.getInt("user_id"),rs.getString("user_name")));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listusers;	
	}
	
	public void addUser(User newUser) {
		Connection connect = null;
		PreparedStatement statement = null;
		try {
			connect = DatabaseConfig.getConnection();
			String user_name = newUser.getUser_name();
			String q = "insert into users(user_name) values(?)";
			statement = connect.prepareStatement(q);
			statement.setString(1,"Ashi");
			statement.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void updateUser(User newUser) {
		Connection connect = null;
		PreparedStatement statement = null;
		try {
			connect = DatabaseConfig.getConnection();
			String user_name = newUser.getUser_name();
			String q = "update users set user_name=? where user_id=?";
			statement = connect.prepareStatement(q);
			statement.setString(1,"Deeps");
			statement.setInt(2,3);
			statement.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// like wise all the crud ops are done

}
