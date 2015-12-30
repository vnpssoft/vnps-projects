package com.vnps.core.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactory {

	private static SpringBeanFactory beanFactory = new SpringBeanFactory();
	
	private ClassPathXmlApplicationContext xmlApplCtx = null;
	
	private SpringBeanFactory() {
		
	}
}
