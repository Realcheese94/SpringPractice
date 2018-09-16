package com.spring.lec1;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println(student1.getHeight());
		System.out.println(student1.getName());
		
	}
}
