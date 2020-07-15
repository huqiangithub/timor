package com.hq.helloLinux.service.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	@Autowired
	public AmqpTemplate rabbitTemplate;
	
	public void directSend(String message) {
		System.out.println("Direct 发送消息："+message);
		//参数一：交换器名称，可以省略（省略存储到AMQP default交换器）；参数二：路由键名称（direct模式下路由键=队列名称）；参数三：存储消息
		rabbitTemplate.convertAndSend("direct", message);
	}
}
