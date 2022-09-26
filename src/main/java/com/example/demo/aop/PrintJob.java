package com.example.demo.aop;

import org.springframework.stereotype.Component;

@Component
public class PrintJob {

	public void print(String x) {
		System.out.println(x);
	}
	
}
