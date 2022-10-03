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

import com.example.demo.entity.Stock;
import com.example.demo.service.StockService;

@RestController
@RequestMapping("/restful")
public class StockRestController {

	@Autowired
	public StockService stockService;
	
	
	@GetMapping(path = "/stock")
	public List<Stock> getStockWithId(@RequestParam(required = false, name = "id") String id) throws IOException {
		if(id != null) {
			return stockService.getStockWithId(id) ;
		}else {
			return stockService.getStocks() ;
		}
	}
	
	@PostMapping("stock")
	public Stock insertStock(@RequestBody Stock stockParm) {
		return stockService.insert(stockParm);
	}
	
	@DeleteMapping("stock")
	public Stock deteteStock(@RequestParam(name = "id") String id) {
		return stockService.deteteStock(id);
	}
	
	@PutMapping("stock")
	public Stock UpdateStock(@RequestBody Stock updateParm) {
		return stockService.updateStock(updateParm);
	}
}
