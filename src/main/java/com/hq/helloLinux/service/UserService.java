package com.hq.helloLinux.service;

import com.hq.helloLinux.entity.User;

public interface UserService {
	public User findUserByAccount(String account);
}
