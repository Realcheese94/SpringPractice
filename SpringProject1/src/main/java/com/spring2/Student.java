package com.spring2;

public class Student {
	private String name;
	private String classNum;
	private String gradeNume;
	
	
	
	
	
	
	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getClassNum() {
		return classNum;
	}






	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}






	public String getGradeNume() {
		return gradeNume;
	}






	public void setGradeNume(String gradeNume) {
		this.gradeNume = gradeNume;
	}






	public void getStudentInfo() {
		System.out.println("studnet's name is"+this.name);
		System.out.println("student's gradeNume"+this.gradeNume);
		System.out.println("student's classNum is "+this.classNum);
	}
	

}
