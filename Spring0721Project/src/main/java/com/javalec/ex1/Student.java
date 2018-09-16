package com.javalec.ex1;

public class Student {
	private String name;
	private String nickname;
	private String gradeNum;
	private String address;
	
	public Student(String name,String nickname,String address,String gradeNum) {
		this.name = name;
		this.nickname = nickname;
		this.address = address;
		this.gradeNum = gradeNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	

}
