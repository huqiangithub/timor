package com.hq.helloLinux.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hq.helloLinux.entity.User;
import com.hq.helloLinux.mapper.UserMapper;
import com.hq.helloLinux.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Transactional(propagation=Propagation.NOT_SUPPORTED) // 不事务
	@Override
	public User findUserByAccount(String account) {
		// TODO Auto-generated method stub
		return userMapper.findUserByAccount(account);
	}

}
