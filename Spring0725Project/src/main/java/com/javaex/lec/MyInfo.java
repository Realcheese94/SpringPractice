package com.javaex.lec;

import java.awt.HeadlessException;
import java.util.ArrayList;

public class MyInfo {
	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobbys;
	private BMICalculator bmiCalculator;
	
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setWeight(double weigth) {
		this.weight = weigth;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public void bmiCalculator(double weight, double height) {
		bmiCalculator.bmitesting(weight,height);
	}
	
	public void getInfo() {
		System.out.println("이름 "+ name);
		System.out.println("키 "+height);
		System.out.println("취미" + hobbys);
		System.out.println("몸무게 "+ weight);
		bmiCalculator(weight,height);
	}
	

}
