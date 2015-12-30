package com.vnps.camunda.util;

import java.util.HashMap;
import java.util.Map;

import org.camunda.commons.logging.BaseLogger;

public class CamundaLogger extends BaseLogger {

	private Map<String, CamundaLogger> loggerMap = new HashMap<String, CamundaLogger>();
	
	private static CamundaLogger logger = new CamundaLogger();
	
	public CamundaLogger getLogger(String loggerName) {
		CamundaLogger logger = loggerMap.get(loggerName);
		if (logger == null) {
			synchronized (loggerMap) {
				logger = new CamundaLogger();
				loggerMap.put(loggerName, logger);
			}
		}
		return logger;
	}
	
	public static CamundaLogger getInstance() {
		return logger;
	}
}	
