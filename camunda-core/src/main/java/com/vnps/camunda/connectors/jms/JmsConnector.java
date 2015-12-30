package com.vnps.camunda.connectors.jms;

import org.camunda.connect.spi.Connector;

public interface JmsConnector extends Connector<JmsRequest> {

	static final String ID_JMS_CONNECTOR ="jms-connector";
}
