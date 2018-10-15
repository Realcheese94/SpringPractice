package com.spring3;

public class Student {
private String name;
private int age;




public String getName() {

	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public void getInfo() {
	System.out.println("이름은"+name);
	System.out.println("나이는"+age);
}


}
