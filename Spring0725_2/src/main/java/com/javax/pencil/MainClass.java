package com.javax.pencil;

import java.security.PermissionCollection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String args[]) {
		String configlocation = "classpath:ApplicationCTX.xml";
		AbstractApplicationContext aac = new GenericXmlApplicationContext(configlocation);
		Pencil mypen = aac.getBean("Pencil",Pencil.class);
		mypen.use();
		aac.close();
	}
}
