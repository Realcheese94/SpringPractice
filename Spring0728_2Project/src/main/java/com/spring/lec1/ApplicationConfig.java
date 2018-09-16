package com.spring.lec1;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		Student student = new Student("홍길동" , "20",hobbys);
		student.setHeight(30);
		student.setWeight(155);
		return student;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("음식 먹기");
		hobbys.add("컴퓨터게임");
		Student student = new Student("김기자" , "50",hobbys);
		student.setHeight(70);
		student.setWeight(235);
		return student;
		
	}
}
