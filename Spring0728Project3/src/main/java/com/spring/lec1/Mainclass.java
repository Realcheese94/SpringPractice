package com.spring.lec1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {
	public static void main(String args[]) {
		String configLocation = "classpath:ApplicationCTX.xml";
		AbstractApplicationContext aac = new GenericXmlApplicationContext(configLocation);
		Student student = aac.getBean("student1",Student.class);
		System.out.println(student.getAge());
		System.out.println(student.getName());
		
		Student student2  = aac.getBean("student2",Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
	}

}
