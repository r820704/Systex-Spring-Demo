package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4jTest {
	  public static void main(String[] args) {
	    Logger logger = LoggerFactory.getLogger(SLF4jTest.class);
	    logger.info("Hello World");
	  }
}
