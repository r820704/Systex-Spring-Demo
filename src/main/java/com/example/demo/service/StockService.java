package com.example.demo.service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.StockEntity;
import com.example.demo.repository.StockRepository;

@Service
@Transactional
public class StockService {
	
	@Autowired
	public StockRepository stockRepository;
	
	public List<StockEntity> getStocks() throws IOException {
		return stockRepository.findAll();
	}
	
	public List<StockEntity> getStockWithBrokerid(String brokerid) {
		return stockRepository.findByBrokerid(brokerid);
	}
	
//	public List<StockEntity> getStockWithBrokerid(String brokerid) {
//		
//		List stocks = stockRepository.findAll().stream()
//				.filter(stock -> stock.getBrokerid().equalsIgnoreCase(brokerid.toString()))
//				.collect(Collectors.toList());
//		return stocks;
//	}

	public StockEntity insert(StockEntity stockParm) {
		return stockRepository.saveAndFlush(stockParm);
	}

	public boolean deteteStock(String brokerid) {
		stockRepository.deleteByBrokerid(brokerid);
		return true;
	}

	public StockEntity updateStock(StockEntity updateParm) {
		Boolean match = stockRepository.findAll().stream().
			anyMatch(stock -> stock.getBrokerid().equalsIgnoreCase(updateParm.getBrokerid()));
		if(match) {
			return stockRepository.saveAndFlush(updateParm);
		}
		return null;
	}
	

}
