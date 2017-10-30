package org.dummyproject.hellogradle;

import org.apache.log4j.Logger;

public class SpecialLogger {

	Logger specialLogger = null;

	public SpecialLogger(Logger logger)
	{
		this.specialLogger = logger;
	}

	public void writeLog(String parameter) {

		if (this.specialLogger.isDebugEnabled()) {
			this.specialLogger.debug("This is debug : " + parameter);
		}

		if (this.specialLogger.isInfoEnabled()) {
			this.specialLogger.info("This is info : " + parameter);
		}

		this.specialLogger.warn("This is warn : " + parameter);
		this.specialLogger.error("This is error : " + parameter);
		this.specialLogger.fatal("This is fatal : " + parameter);

	}


}
