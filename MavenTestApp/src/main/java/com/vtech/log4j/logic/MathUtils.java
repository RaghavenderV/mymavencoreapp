/*
* Author@ Raghavender Vodapally
* Date@ Feb 17, 2018
*/

package com.vtech.log4j.logic;

import org.apache.log4j.Logger;

public class MathUtils {

	private static final Logger logger = Logger.getLogger(MathUtils.class);

	public static int add(int x, int y) {
		logger.debug("inputs are: " + x + " " + y);
		return (x + y);
	}

}
