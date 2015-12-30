package com.vnps.core.logging;

import java.util.HashMap;
import java.util.Map;

import com.vnps.core.logging.impl.Slf4jImpl;

public class LogFactory {

	private static LogFactory logFactory = new LogFactory();
	
	private Map<String,Log> loggerMap = new HashMap<String, Log>();
	
	private LogFactory() {
		
	}
	
	public static LogFactory getInstance() {
		return logFactory;
	}
	
	public Log getLog(String loggerName) {
		Log lg = loggerMap.get(loggerName);
		if (lg == null) {
			synchronized (loggerMap) {
				lg = new Slf4jImpl(loggerName);
				loggerMap.put(loggerName, lg);
			}
		}
		return lg;
	}
}
