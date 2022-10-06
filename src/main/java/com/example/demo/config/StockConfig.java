package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.StockService;

@Configuration
@ComponentScan("com.example")
public class StockConfig {

	@Autowired
	public StockService stockService;
	

	
}
