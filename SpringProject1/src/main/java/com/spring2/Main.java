package com.spring2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
	
	Student stu1 = ctx.getBean("student",Student.class);
	stu1.getStudentInfo();
	
	Worker worker1 = ctx.getBean("worker",Worker.class);
	worker1.getWorkerInfo();
	
	
	ctx.close();
	
}
}
