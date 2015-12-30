package com.vnps.core.logging.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vnps.core.logging.Log;

public class Slf4jImpl implements Log {

	private Logger logger = null;
	
	public Slf4jImpl(String loggerName) {
		logger = LoggerFactory.getLogger(loggerName);
	}
	
	public void logDebug(String transId, List<String> dataList, String info) {
		// TODO Auto-generated method stub
		if (logger.isDebugEnabled()) {
			logger.debug(getLog(transId, dataList, info));
		}
	}

	public void logInfo(String transId, List<String> dataList, String info) {
		// TODO Auto-generated method stub
		if (logger.isInfoEnabled()) {
			logger.info(getLog(transId, dataList, info));
		}
	}

	public void logError(String transId, List<String> dataList, String info, Throwable t) {
		// TODO Auto-generated method stub
		if (logger.isErrorEnabled()) {
			logger.error(getLog(transId, dataList, info),t);
		}

	}
	
	private String getLog(String transId,List<String> dataList,String info) {
		StringBuilder sbLog = new StringBuilder();
		sbLog.append(transId + " | ");
		for (String s:dataList) {
			sbLog.append(s + " | ");
		}
		sbLog.append(info);
		return sbLog.toString();
	}

}
