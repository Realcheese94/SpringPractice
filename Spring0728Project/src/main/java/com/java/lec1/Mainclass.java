package com.java.lec1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {
public static void main(String args[]) {
	String configLocation = "classpath:Application1CTX.xml";
	String configLocation2 = "classpath:Application2CTX.xml";
	AbstractApplicationContext aac = new GenericXmlApplicationContext(configLocation,configLocation2);
	Student student = aac.getBean("student",Student.class);
	System.out.println(student.getHobbys());
	System.out.println(student.getAge());
	
	StudentInfo studentInfo = aac.getBean("studentInfo",StudentInfo.class);
	Student student2 = studentInfo.getStudent();
	System.out.println(student2.getName());
	aac.close();

}
}
