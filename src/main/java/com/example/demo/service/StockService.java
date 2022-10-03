package com.example.demo.service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stock;
import com.example.demo.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	public StockRepository stockRepository;
	
	public List<Stock> getStocks() throws IOException {
		return stockRepository.getStocks();
	}
	
	public List<Stock> getStockWithId(String id) {
		List stocks = stockRepository.getStocks().stream()
				.filter(stock -> stock.getId().equalsIgnoreCase(id.toString()))
				.collect(Collectors.toList());
		return stocks;
	}

	public Stock insert(Stock stockParm) {
		return stockRepository.insert(stockParm);
	}

	public Stock deteteStock(String id) {
		return stockRepository.deleteStock(id);
	}

	public Stock updateStock(Stock updateParm) {
		Boolean match = stockRepository.getStocks().stream().
			anyMatch(stock -> stock.getId().equalsIgnoreCase(updateParm.getId()));
		if(match) {
			return stockRepository.updataStock(updateParm);
		}
		return null;
	}
	

}
