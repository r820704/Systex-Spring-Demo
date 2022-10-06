package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK")
public class Stock {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seqno;
	
	@Column
	private String id;
	@Column
	private String stockName;
	@Column
	private String price;
	@Column
	private String capitalStock;
	@Column
	private String type;
	@Column
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

	@Override
	public int hashCode() {
		return Objects.hash(capitalStock, id, price, representative, stockName, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		return Objects.equals(capitalStock, other.capitalStock) && Objects.equals(id, other.id)
				&& Objects.equals(price, other.price) && Objects.equals(representative, other.representative)
				&& Objects.equals(stockName, other.stockName) && Objects.equals(type, other.type);
	}

	public Long getSeqno() {
		return seqno;
	}

	public void setSeqno(Long seqno) {
		this.seqno = seqno;
	}
	
}
