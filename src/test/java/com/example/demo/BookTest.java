package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.config.DemoConfig;
import com.example.demo.entity.Book;

import net.bytebuddy.description.modifier.MethodArguments;

public class BookTest {

	@Test
	public void testBook() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		Book book1 = context.getBean(Book.class, "book1");
				
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		Book book1 = context.getBean(Book.class, "book1");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
//		Book book1 = context.getBean(Book.class, "book1");
//		System.out.println("book1 = " + book1);
		
		Book book2 = context.getBean(Book.class, "book2");
		System.out.println("book2 = " + book2);
		
	}
	
//	@RequestMapping(value = "/test" , method = RequestMethod.GET)
//	public void testRequest() {
//		
//	}
	
}
