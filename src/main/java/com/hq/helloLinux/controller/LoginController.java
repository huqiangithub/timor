package com.hq.helloLinux.controller;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hq.helloLinux.config.interceptor.LoginInterceptor;
import com.hq.helloLinux.entity.LoginInfo;
import com.hq.helloLinux.entity.LoginResp;
import com.hq.helloLinux.entity.User;
import com.hq.helloLinux.service.UserService;
import com.hq.helloLinux.service.serviceImpl.UserServiceImpl;
import com.hq.helloLinux.util.RedisUtil;

@RestController
@RequestMapping("/timor")
public class LoginController {
	
	@Resource
	private RedisUtil redisUtil;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String hello() {
		return "timor loved his father best!";
	}
	
	@RequestMapping("/login/account")
	public LoginResp login(@RequestBody LoginInfo loginInfo,HttpServletRequest request) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url = "jdbc:mysql://139.155.7.242:3306/timor?characterEncoding=utf8&useSSL=false&serverTimezone=GMT";
//		Connection con = DriverManager.getConnection(url, "root", "123456");
//		Statement statement = con.createStatement();
//		ResultSet resultSet = statement.executeQuery("select * from sys_user");
//		while (resultSet.next()) {
//			System.out.println("查询结果： "+resultSet.getString("name"));
//		}
		User user = userService.findUserByAccount(loginInfo.getUserName());
		if(loginInfo.getPassword().equals(user.getPassWord())) {
			HttpSession session=request.getSession();
			session.setAttribute("userName",loginInfo.getUserName());
			redisUtil.set("loginUser:" +loginInfo.getUserName(), JSON.toJSONString(user), 18000L);
//			redisUtil.set("loginUser:" +loginInfo.getUserName(), user, 180L);
			return new LoginResp("ok", loginInfo.getType(), "admin");
		}else {
			return new LoginResp("error", loginInfo.getType(), "guest");
		}
	}
	
	@RequestMapping("/currentUser")
	public User getCurrentUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String userName = (String)session.getAttribute("userName");
		User user=JSON.parseObject((String)redisUtil.get("loginUser:"+userName), User.class);
//		User user=(User)redisUtil.get("loginUser:"+userName);
		return user;
	}
}
