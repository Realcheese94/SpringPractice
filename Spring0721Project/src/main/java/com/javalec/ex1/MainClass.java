package com.javalec.ex1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String args[]) {
		//xml 파일 참조
				String configLocation = "classpath:applicationCTX.xml";
		//abstarctapplication 으로 객체 생성
				AbstractApplicationContext aac = new GenericXmlApplicationContext(configLocation);
		//studentinfo 로 getbean해서 새로이 생성
				StudentInfo studentInfo = aac.getBean("studentinfo",StudentInfo.class);
		
				studentInfo.getStudentInfo();
		//새로운 student 객체 생성 
				Student student2 = aac.getBean("student2",Student.class);
				studentInfo.setStudentInfo(student2);
				studentInfo.getStudentInfo();
	aac.close();
	}
}
