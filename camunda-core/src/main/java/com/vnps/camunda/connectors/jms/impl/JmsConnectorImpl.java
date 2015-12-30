package com.vnps.camunda.connectors.jms.impl;

import java.util.Collection;
import java.util.List;

import org.camunda.connect.spi.Connector;
import org.camunda.connect.spi.ConnectorRequestInterceptor;
import org.camunda.connect.spi.ConnectorResponse;

import com.vnps.camunda.connectors.jms.JmsConnector;
import com.vnps.camunda.connectors.jms.JmsRequest;

public class JmsConnectorImpl implements JmsConnector {
	
	private String connectorId = null;
	
	public JmsConnectorImpl(String connectorId) {
		this.connectorId = connectorId;
	}
	
	public Connector<JmsRequest> addRequestInterceptor(ConnectorRequestInterceptor arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Connector<JmsRequest> addRequestInterceptors(Collection<ConnectorRequestInterceptor> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public JmsRequest createRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	public ConnectorResponse execute(JmsRequest jmsReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return connectorId;
	}

	public List<ConnectorRequestInterceptor> getRequestInterceptors() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRequestInterceptors(List<ConnectorRequestInterceptor> arg0) {
		// TODO Auto-generated method stub

	}

}
