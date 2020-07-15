package com.hq.helloLinux.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SelfAutowiredTest {
	
	private final static Logger logger = LoggerFactory.getLogger(SelfAutowiredTest.class);

	@Pointcut("execution(public * com.hq.helloLinux.service.serviceImpl.DailyServiceImpl.select*(..))")
	public void selfAutowired() {};
	
	@Before("selfAutowired()")
	public void doBefore(JoinPoint joinPoint) {
		logger.info("selfAutowired doBefore"+joinPoint.getSignature().getName());
	}
}
