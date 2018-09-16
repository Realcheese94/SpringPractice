package com.java.lec1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {
	public static void main(String []args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:ApplicationCTX.xml");
		ctx.refresh();
		ctx.close();
		System.out.println("end");
	}

}
