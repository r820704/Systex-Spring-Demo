package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.core.Book;

@Configuration
public class DemoConfig {

	@Bean(name = "book2")
	public Book book2() {
		Book book2 = new Book();
		book2.setName("HeadFirst");
		book2.setAuthor("O'Reilly");
		return book2;
	}
	
	
	
}
