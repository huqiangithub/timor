package com.hq.helloLinux.entity;

import java.util.Map;

public class BaseResp {
	private Integer status;
	private String message;
	private Map body;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map getBody() {
		return body;
	}
	public void setBody(Map body) {
		this.body = body;
	}
}
