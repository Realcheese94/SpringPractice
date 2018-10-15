package com.spring3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	

	
	public static void main(String[] args) {
		AbstractApplicationContext aac = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student student = aac.getBean("student3",Student.class);
		student.getInfo();
		
		Worker worker = aac.getBean("worker3",Worker.class);
		worker.getInfo();
		
		
		aac.close();
	}
}
