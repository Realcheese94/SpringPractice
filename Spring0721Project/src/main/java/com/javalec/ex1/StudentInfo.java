package com.javalec.ex1;

public class StudentInfo {
private Student student;
	public StudentInfo(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		System.out.println("이름은"+student.getName());
		System.out.println("별명은"+student.getNickname());
		System.out.println("주소은"+student.getAddress());
		System.out.println("학년은"+student.getGradeNum());
		
	}
	public void setStudentInfo(Student student) {
		this.student = student;
	}
}
