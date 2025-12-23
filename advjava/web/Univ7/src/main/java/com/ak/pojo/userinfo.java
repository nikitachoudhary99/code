package com.ak.pojo;

public class userinfo {
 private String username;
 private String password;
	
	
	public userinfo() {
	super();
	// TODO Auto-generated constructor stub
}


	public userinfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

}
