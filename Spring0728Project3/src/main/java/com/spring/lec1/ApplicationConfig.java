package com.spring.lec1;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	
	
	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("soccer");
		hobbys.add("basketball");
		Student student = new Student("김말숙",20,hobbys);
		student.setHeight(230);
		student.setWeight(111);
		return student;
	}
}
