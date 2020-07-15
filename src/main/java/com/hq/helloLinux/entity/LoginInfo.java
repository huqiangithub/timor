package com.hq.helloLinux.entity;

public class LoginInfo {
	private String userName;
	private String password;
	private String type;
//	public LoginInfo(String userName,String password,String type) {
//		// TODO Auto-generated constructor stub
//		this.userName=userName;
//		this.password=password;
//		this.type=type;
//	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
