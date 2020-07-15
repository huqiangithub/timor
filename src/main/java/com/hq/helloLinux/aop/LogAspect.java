package com.hq.helloLinux.aop;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@Aspect
@Component
public class LogAspect {
	private final static Logger logger= LoggerFactory.getLogger(LogAspect.class);
	
	/**
	 * 
	 */
	@Pointcut("execution(public * com.hq.helloLinux.controller..*.*(..))")
	public void webLog(){}
	
	@Pointcut("!execution(public * com.hq.helloLinux.controller..*.login*(..))&&execution(public * com.hq.helloLinux.controller..*.*(..))")
	public void webLogg(){}
	
	@Before("webLog()||webLogg()")
	public void doBefore(JoinPoint joinPoint) {
		ServletRequestAttributes attributes =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		
		logger.info("URL:"+request.getRequestURI().toString());
		logger.info("HTTP_METHOD:"+request.getMethod());
		logger.info("IP:"+request.getRemoteAddr());
		logger.info("CLASS_METHOD:"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
		logger.info("ARGS:"+Arrays.toString(joinPoint.getArgs()));
	}
	
	@AfterReturning(returning="ret",pointcut="webLog()")
	public void doAfterReturning(Object ret) {
		logger.info("RESPONSE:"+ret);
	}
	
}
