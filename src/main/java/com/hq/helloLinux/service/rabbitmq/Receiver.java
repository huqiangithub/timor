package com.hq.helloLinux.service.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="direct")
public class Receiver {
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@RabbitHandler
	public void process(String message) {
		System.out.println("Direct 消费消息："+message);
	}
}
