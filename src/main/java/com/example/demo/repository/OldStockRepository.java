package com.example.demo.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.StockEntity;

public class OldStockRepository {
//	
//	private static final String SAPARATER_DELIMITER = "-" ;
//	private List<StockEntity> stocks = new ArrayList<>();
//
//	public OldStockRepository() throws IOException {
//		try (BufferedReader br = new BufferedReader(new FileReader("stock.txt"))) {
//		    String line;
//		    br.readLine();
//		    while ((line = br.readLine()) != null) {
//		        String[] values = line.split(SAPARATER_DELIMITER);
//		        StockEntity stock = new StockEntity();
//		        stock.setId(values[0]);
//		        stock.setStockName(values[1]);
//		        stock.setPrice(values[2]);
//		        stock.setCapitalStock(values[3]);
//		        stock.setType(values[4]);
//		        stock.setRepresentative(values[5]);
//		        System.out.println(stock.toString());
//		        stocks.add(stock);
//		    }
//		}
//	}
//	
//	public StockEntity deleteStock(String id) {
//		StockEntity targetStock = stocks.stream()
//				.filter(stock -> id.equalsIgnoreCase(stock.getId()))
//				.findFirst().get();
//		stocks.remove(targetStock);
//		
//		return targetStock;
//	}
//	
//	public StockEntity insert(StockEntity stockParm) {
//		stocks.add(stockParm);
//		return stockParm;
//	}
//	
//	public StockEntity updataStock(StockEntity updateParm) {
//		StockEntity targetStock = stocks.stream()
//				.filter(stock -> stock.getId().equalsIgnoreCase(updateParm.getId()))
//				.findFirst().get();
//		targetStock.setCapitalStock(updateParm.getCapitalStock());
//		targetStock.setPrice(updateParm.getPrice());
//		targetStock.setRepresentative(updateParm.getRepresentative());
//		targetStock.setStockName(updateParm.getStockName());
//		targetStock.setType(updateParm.getType());
//		
//		return targetStock;
//	}
//
//
//	public List<StockEntity> getStocks() {
//		return stocks;
//	}
//
//	public void setStocks(List<StockEntity> stocks) {
//		this.stocks = stocks;
//	}
//
//





	
	
	
}
