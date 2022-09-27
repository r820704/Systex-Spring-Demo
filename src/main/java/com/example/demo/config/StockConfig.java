package com.example.demo.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.core.Stock;

@Configuration
public class StockConfig {

	private static final String SAPARATER_DELIMITER = "-" ;
	
	@Bean
	public ArrayList<Stock> stockList() throws FileNotFoundException, IOException{
		ArrayList<Stock> stockList = new ArrayList<Stock>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("stock.txt"))) {
		    String line;
		    br.readLine();
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(SAPARATER_DELIMITER);
		        Stock stock = new Stock();
		        stock.setId(values[0]);
		        stock.setStockName(values[1]);
		        stock.setPrice(values[2]);
		        stock.setCapitalStock(values[3]);
		        stock.setType(values[4]);
		        stock.setRepresentative(values[5]);
		        System.out.println(stock.toString());
		        stockList.add(stock);
		    }
		}
		return stockList;
	}
	
}
