package com.hq.helloLinux.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hq.helloLinux.service.rabbitmq.Sender;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitmqController {
	
	@Autowired
	private Sender sender;
	
	@RequestMapping("/test")
	public void test() {
		SimpleDateFormat sFormat=new SimpleDateFormat("yyyy-MM-dd");
		sender.directSend("Direct Data");
	}
}
