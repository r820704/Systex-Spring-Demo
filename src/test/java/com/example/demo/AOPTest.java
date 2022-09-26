package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.aop.AopConfig;
import com.example.demo.aop.PrintJob;

public class AOPTest {

	public static void main(String[] args) {

		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AopConfig.class);
		PrintJob printJob = context.getBean(PrintJob.class, "printJob" );
		printJob.print("hello");
	}

}
