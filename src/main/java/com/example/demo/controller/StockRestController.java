package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StockEntity;
import com.example.demo.service.StockService;

@RestController
@RequestMapping("/restful")
public class StockRestController {

	@Autowired
	public StockService stockService;
	
	
	@GetMapping(path = "/stock")
	public List<StockEntity> getStockWithBrokerid(@RequestParam(required = false, name = "brokerid") String brokerid) throws IOException {
		if(brokerid != null) {
			return stockService.getStockWithBrokerid(brokerid) ;
		}else {
			return stockService.getStocks() ;
		}
	}
	
	@PostMapping("stock")
	public StockEntity insertStock(@RequestBody StockEntity stockParm) {
		return stockService.insert(stockParm);
	}
	
	@DeleteMapping("stock")
	public boolean deteteStock(@RequestParam(name = "brokerid") String brokerid) {
		return stockService.deteteStock(brokerid);
	}
	
	@PutMapping("stock")
	public StockEntity UpdateStock(@RequestBody StockEntity updateParm) {
		return stockService.updateStock(updateParm);
	}
}
