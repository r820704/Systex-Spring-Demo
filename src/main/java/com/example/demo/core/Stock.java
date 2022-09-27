package com.example.demo.core;

import java.math.BigDecimal;

public class Stock {
	
	private String id;
	private String stockName;
	private String price;
	private String capitalStock;
	private String type;
	private String representative;
	
	public Stock() {
		super();
	}

	public Stock(String id, String stockName, String price, String capitalStock, String type, String representative) {
		super();
		this.id = id;
		this.stockName = stockName;
		this.price = price;
		this.capitalStock = capitalStock;
		this.type = type;
		this.representative = representative;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", stockName=" + stockName + ", price=" + price + ", capitalStock=" + capitalStock
				+ ", type=" + type + ", representative=" + representative + "]";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCapitalStock() {
		return capitalStock;
	}

	public void setCapitalStock(String capitalStock) {
		this.capitalStock = capitalStock;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRepresentative() {
		return representative;
	}
	public void setRepresentative(String representative) {
		this.representative = representative;
	}
	
	
}
