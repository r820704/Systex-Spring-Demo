package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.entity.Stock;
import com.example.demo.repository.StockRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { com.example.demo.config.StockConfig.class })
public class StockApplicationTests {

	@Autowired
	public StockRepository stockRepository;
	
	@Test
	void contextLoads() {
		System.out.println("123");
		List<Stock> list = stockRepository.getStocks();
		System.out.println(list);
	}
	
}
