/*
* Author@ Raghavender Vodapally
* Date@ Feb 17, 2018
*/

package com.vtech.log4j.main;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.vtech.log4j.logic.MathUtils;

public class Log4jExample {

	/*static {
		init();
	}*/

	private final static Logger logger = Logger.getLogger(Log4jExample.class);

	public static void main(String[] args) {
		
		Log4jExample.init();

		logger.debug("My Debug Log");
		logger.info("My Info Log");
		logger.warn("My Warn Log");
		logger.error("My Error Log");
		logger.fatal("My Fatal Log");

		MathUtils.add(20, 30);
		MathUtils.add(40, 50);
		MathUtils.add(60, 70);

		
	}

	public static void init() {
		DOMConfigurator.configure("log4j.xml");
	}

}



