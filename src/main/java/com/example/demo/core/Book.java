package com.example.demo.core;

import org.springframework.stereotype.Component;

//@Component("book1")
public class Book {
	
	private String author;
	private String name;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
