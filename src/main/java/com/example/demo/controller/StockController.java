package com.example.demo.controller;

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

import com.example.demo.core.Stock;

@Controller
@RequestMapping("/springmvc")
public class StockController {

	@Autowired
	public ArrayList<Stock> stockList;
	
	@GetMapping("/stock")
	public String allStock(Model model) {
		model.addAttribute("stockList", stockList);
		return "stock" ;
	}
	
	@GetMapping("/stock/{id}")
	public String getWithStockId(Model model, @PathVariable Long id) {
		List response = stockList.stream()
				.filter(stock -> stock.getId().equalsIgnoreCase(id.toString()))
				.collect(Collectors.toList());
		
		System.out.println("id為"+ id.toString() + "   " + response);
		model.addAttribute("stockList", response);
		
		return "stock" ;
	}
	
}
