package com.spring1;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class Main1004 {

	
	public static void main(String args[]) {
	ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
	ConfigurableEnvironment env = ctx.getEnvironment();
	MutablePropertySources mutablePropertySources = env.getPropertySources();
	
	try {
		mutablePropertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
		System.out.println(env.getProperty("admin.id"));
		System.out.println(env.getProperty("admin.key"));
	}
	catch(IOException e) {}
	
	GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
	gCtx.load("applicationCTX.xml");
	gCtx.refresh();
	
	
	
	
	
	}
	
	
	
}
	
	
	
	