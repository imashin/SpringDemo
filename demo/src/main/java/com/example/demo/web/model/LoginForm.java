package com.example.demo.web.model;

public class LoginForm {
	
	private String username = null;
	private String passwd = null;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	@Override
	public String toString() {
		return "LoginForm [username=" + username + ", passwd=" + passwd + "]";
	}
}
