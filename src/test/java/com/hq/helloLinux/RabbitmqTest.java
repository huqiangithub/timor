package com.hq.helloLinux;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hq.helloLinux.service.rabbitmq.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqTest {
	@Autowired
	private Sender sender;
	@Test
	public void directTest() {
		SimpleDateFormat sFormat=new SimpleDateFormat("yyyy-MM-dd");
		sender.directSend("Direct Data");
	}
}
