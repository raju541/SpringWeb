package com.cts.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HelloWorld {
	
	private static final Logger logger = LogManager.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		BasicConfigurator.configure();  
		  logger.info("Hello world");  
		  logger.info("we are in logger info mode"); 
		  
		  logger.trace("Trace Message!");  
		  logger.debug("Debug Message!");  
		  logger.info("Info Message!");  
	      logger.warn("Warn Message!");  
	      logger.error("Error Message!");  
	      logger.fatal("Fatal Message!");
	}

}
