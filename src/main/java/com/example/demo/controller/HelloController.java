package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.core.Book;

@Controller
public class HelloController {
    
	@Autowired
	public Book book2; 
	
	@GetMapping("/hello123")
    public String hello(Model model) {
		
		model.addAttribute("bookName", book2.getName()); // （變數名稱，變數值)
		model.addAttribute("author", book2.getAuthor());
    	System.out.println("hello!");
        return "hello"; // 要導入的html
    } 
	
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	@ResponseBody
	public String hellController() {
		
		return "Hello1";
	}
}
