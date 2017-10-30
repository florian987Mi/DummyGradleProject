package org.dummyproject.hellogradle;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class CheckNumeric {

	final static Logger logger = Logger.getLogger(CheckNumeric.class);

	public static void main(String[] args) {
		SpecialLogger specialLogger = new SpecialLogger(logger);

		String text1 = "0123a4";
		String text2 = "01234";

		boolean result1 = StringUtils.isNumeric(text1);
		boolean result2 = StringUtils.isNumeric(text2);

		CheckNumeric obj = new CheckNumeric();
		specialLogger.writeLog("Florian");

		System.out.println(text1 + " is a numeric? " + result1);
		System.out.println(text2 + " is a numeric? " + result2);

	}


}