package com.hq.helloLinux.entity;

public class LoginResp {
	private String status;
	public String getCurrentAuthority() {
		return currentAuthority;
	}
	public void setCurrentAuthority(String currentAuthority) {
		this.currentAuthority = currentAuthority;
	}
	private String type;
	private String currentAuthority;
	
	public LoginResp(String status, String type, String currentAuthority) {
		super();
		this.status = status;
		this.type = type;
		this.currentAuthority = currentAuthority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
