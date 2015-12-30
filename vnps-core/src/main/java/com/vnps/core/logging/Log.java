package com.vnps.core.logging;

import java.util.List;

public interface Log {
	
	public void logDebug(String transId,List<String> dataList,String info);
	
	public void logInfo(String transId,List<String> dataList,String info);
	
	public void logError(String transId,List<String> dataList,String info,Throwable t);
}
