package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Stock;
import com.example.demo.service.StockService;

@Controller
@RequestMapping("/springmvc")
public class StockController {

	@Autowired
	public StockService stockService;
	
	@GetMapping("/stock")
	public String getStocks(Model model) throws IOException {
		model.addAttribute("stockList", stockService.getStocks());
		return "stock" ;
	}
	
	@GetMapping("/stock/{id}")
	public String getStockWithId(Model model, @PathVariable String id) {
		model.addAttribute("stockList", stockService.getStockWithId(id));
		return "stock" ;
	}
	
}
