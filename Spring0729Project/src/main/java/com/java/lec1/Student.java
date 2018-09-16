package com.java.lec1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	private String name;
	private String age;
	public Student(String name, String age) {
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
	@Override
	public void destroy() throws Exception {
		System.out.println("destory bean");
		
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterpropertiesSet");
	
		
	}
	

}
