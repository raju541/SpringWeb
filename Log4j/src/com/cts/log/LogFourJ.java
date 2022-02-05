package com.cts.log;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;


public class LogFourJ {
	
	static Logger log = Logger.getLogger(LogFourJ.class.getName());  

	public static void main(String[] args) throws IOException,SQLException {
		// TODO Auto-generated method stub
		
		 log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message");  

	}

}
