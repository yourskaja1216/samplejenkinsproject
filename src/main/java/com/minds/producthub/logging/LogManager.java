package com.minds.producthub.logging;
import org.slf4j.*;

public final class LogManager implements ILogManager {
	private static Logger logger = null;
	
	public LogManager(Class<?> cls){
		logger = LoggerFactory.getLogger(cls);
	}
	
	public LogManager(String name){
		logger = LoggerFactory.getLogger(name);
	}

	@Override
	public void debug(String arg0) {
		logger.debug(arg0);
	}

	@Override
	public void debug(Marker arg0, String arg1) {
		logger.debug(arg0, arg1);
	}

	@Override
	public void debug(String arg0, Object arg1) {
		logger.debug(arg0, arg1);
	}

	@Override
	public void debug(String arg0, Object[] arg1) {
		logger.debug(arg0, arg1);
	}

	@Override
	public void debug(String arg0, Throwable arg1) {
			logger.debug(arg0, arg1);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2) {
		logger.debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object[] arg2) {
		logger.debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Throwable arg2) {
		logger.debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(String arg0, Object arg1, Object arg2) {
		logger.debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, String arg2, Object arg3) {
		logger.debug(arg0, arg1, arg2, arg3);
	}

	@Override
	public void error(String arg0) {
		logger.error(arg0);
	}

	@Override
	public void error(Marker arg0, String arg1) {
		logger.error(arg0, arg1);
	}

	@Override
	public void error(String arg0, Object arg1) {
		logger.error(arg0, arg1);
	}

	@Override
	public void error(String arg0, Object[] arg1) {
		logger.error(arg0, arg1);
	}

	@Override
	public void error(String arg0, Throwable arg1) {
		logger.error(arg0, arg1);
	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2) {
		logger.error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Object[] arg2) {
		logger.error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Throwable arg2) {
		logger.error(arg0, arg1, arg2);
	}

	@Override
	public void error(String arg0, Object arg1, Object arg2) {
		logger.error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, String arg2, Object arg3) {
		logger.error(arg0, arg1, arg2, arg3);
	}

	@Override
	public void info(String arg0) {
		logger.info(arg0);
	}

	@Override
	public void info(Marker arg0, String arg1) {
		logger.info(arg0, arg1);
	}

	@Override
	public void info(String arg0, Object arg1) {
		logger.info(arg0, arg1);
	}

	@Override
	public void info(String arg0, Object[] arg1) {
		logger.info(arg0, arg1);
	}

	@Override
	public void info(String arg0, Throwable arg1) {
		logger.info(arg0, arg1);
	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2) {
		logger.info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Object[] arg2) {
		logger.info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Throwable arg2) {
		logger.info(arg0, arg1, arg2);
	}

	@Override
	public void info(String arg0, Object arg1, Object arg2) {
		logger.info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, String arg2, Object arg3) {
		logger.info(arg0, arg1, arg2, arg3);
	}

	@Override
	public void warn(String arg0, Object arg1) {
		logger.warn(arg0, arg1);
		
	}
}
