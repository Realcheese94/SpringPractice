package com.java.lec1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class OtherStudent {
	private String name;
	private String age;
	
	public OtherStudent(String name, String age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@PostConstruct
	public void initialMethod() {
		System.out.println("start bean");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy bean");
	}
	
}
