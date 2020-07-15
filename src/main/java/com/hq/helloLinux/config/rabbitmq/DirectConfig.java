package com.hq.helloLinux.config.rabbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;

@Configuration
public class DirectConfig {
	final static String QUEUE_NAME = "direct"; //队列名称
	final static String EXCHANGE_NAME = "mydirect"; //交换器名称
	
	@Bean
	public Queue queue() {
		return new Queue(DirectConfig.QUEUE_NAME, false);
	}
	
	@Bean
	DirectExchange directExchange() {
		return new DirectExchange(DirectConfig.EXCHANGE_NAME, false, false);
	}
	
	// 绑定队列和交换器
	Binding bindingExchangeDirectQueue(Queue queue,DirectExchange directExchange) {
		return BindingBuilder.bind(queue).to(directExchange).with(DirectConfig.QUEUE_NAME);
	}
}
