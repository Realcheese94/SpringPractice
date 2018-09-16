package com.java.lec0729;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main0729 {

	public static void main(String[] args) {
		GenericXmlApplicationContext CTX = new GenericXmlApplicationContext();
		CTX.load("classpath:ApplicationCTX2.xml");
		Student student = CTX.getBean("student",Student.class);
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		Student student2 = CTX.getBean("student",Student.class);
		student2.setId("12331");
		student2.setName("김기자");
		System.out.println(student2.getId());
		System.out.println(student2.getName());
		
		
		System.out.println("\n\n\n\n");
		if ( student2.equals(student)) {
			System.out.println("같좌나");
		}
		else {
			System.out.println("다르자놔");
		}
	}
}
