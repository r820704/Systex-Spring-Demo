package com.example.demo.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Stock;

@Repository
public class StockRepository {
	
	private static final String SAPARATER_DELIMITER = "-" ;
	private List<Stock> stocks = new ArrayList<>();

	public StockRepository() throws IOException {
//		try (BufferedReader br = new BufferedReader(new FileReader("stock.txt"))) {
//		    String line;
//		    br.readLine();
//		    while ((line = br.readLine()) != null) {
//		        String[] values = line.split(SAPARATER_DELIMITER);
//		        Stock stock = new Stock();
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
	}
	
	public Stock deleteStock(String id) {
		Stock stock = null;
		for(Stock aStock : stocks) {
			if(aStock.getId().equals(id)) {
				stock = aStock;
			}
		}
		stocks.remove(stock);
		return stock;
	}
	
	public Stock insert(Stock stockParm) {
		stocks.add(stockParm);
		return stockParm;
	}
	
	public Stock updataStock(Stock updateParm) {
		Stock stock = null;
		for(Stock aStock : stocks) {
			if(aStock.getId().equals(updateParm.getId())) {
				aStock.setCapitalStock(updateParm.getCapitalStock());
				aStock.setPrice(updateParm.getPrice());
				aStock.setRepresentative(updateParm.getRepresentative());
				aStock.setStockName(updateParm.getStockName());
				aStock.setType(updateParm.getType());
				stock = aStock;
			}
		}
		return stock;
	}


	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}







	
	
	
}
