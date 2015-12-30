package com.vnps.camunda.connectors.jms;

import java.util.Properties;

import org.camunda.connect.spi.ConnectorRequest;

public interface JmsRequest extends ConnectorRequest<JmsResponse> {

	public void setJmsHeaderProperties(Properties p);
}
