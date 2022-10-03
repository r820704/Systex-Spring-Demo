package com.example.demo.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Stock;
import com.example.demo.service.StockService;

@Configuration
public class StockConfig {

	@Autowired
	public StockService stockService;
	

	
}
