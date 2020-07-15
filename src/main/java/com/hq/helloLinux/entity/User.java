package com.hq.helloLinux.entity;

import java.math.BigInteger;
import com.alibaba.fastjson.annotation.JSONField;

public class User {
	@JSONField(serialize=false)
	private transient String account;
	@JSONField(serialize=false)
	private transient String passWord;
	private String name;
	private String avatar;
	private BigInteger userid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public BigInteger getUserid() {
		return userid;
	}
	public void setUserid(BigInteger userid) {
		this.userid = userid;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
