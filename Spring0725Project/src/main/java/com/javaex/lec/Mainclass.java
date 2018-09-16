package com.javaex.lec;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
 	
	String configlocation = "classpath:applicationCTX2.xml";
	
	AbstractApplicationContext aac = new GenericXmlApplicationContext(configlocation);
	
	MyInfo myinfo = aac.getBean("myinfo",MyInfo.class);
	myinfo.getInfo();
	aac.close();
	}
}
