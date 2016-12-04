package com.mjduan.project;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	@Test
	public void test(){
		LOGGER.info("info....");
		
		LOGGER.warn("warn....");
		
		LOGGER.error("error....");
	}


}
