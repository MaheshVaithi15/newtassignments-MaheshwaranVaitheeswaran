package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="users")
@Table(name="users")
public class Users {
	@Id
	@Column(name="user_id")
	int userid;
	@Column(name="user_name")
	String username;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Users(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
	
	
	
	

}
