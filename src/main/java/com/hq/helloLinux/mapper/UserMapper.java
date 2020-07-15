package com.hq.helloLinux.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hq.helloLinux.entity.User;

@Mapper
public interface UserMapper {
	public User findUserByAccount(String account);
}
