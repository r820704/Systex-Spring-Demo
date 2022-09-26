package com.example.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Before(value = "execution(public void com.example.demo.aop.PrintJob.print(String))")
	public void beforeAdvise() {
		System.out.println("this is beforeAdvise");
		logger.debug("beforeAdvise debug message");
	}
	
	public void afterAdvise() {
		
	}
	
	
}
