package com.vnps.camunda.connectors.jms.impl;

import org.camunda.connect.spi.Connector;

import com.vnps.camunda.connectors.jms.JmsConnector;
import com.vnps.camunda.connectors.jms.JmsConnectorProvider;

public class JmsConnectorProviderImpl implements JmsConnectorProvider {

	public Connector<?> createConnectorInstance() {
		// TODO Auto-generated method stub
		return new JmsConnectorImpl(JmsConnector.ID_JMS_CONNECTOR);
	}

	public String getConnectorId() {
		// TODO Auto-generated method stub
		return JmsConnector.ID_JMS_CONNECTOR;
	}

}
