package com.example.demo;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import com.example.demo.entity.Stock;
import com.example.demo.repository.StockRepository;

public class StockRepositoryTest {

	public static void main(String[] args) throws IOException {
		StockRepository sr = new StockRepository();
		List<Stock> list = sr.getStocks();
		list.forEach(System.out::println);
		
		list.sort(new Comparator<Stock>() {

			@Override
			public int compare(Stock o1, Stock o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		
		});

		
	}

}
