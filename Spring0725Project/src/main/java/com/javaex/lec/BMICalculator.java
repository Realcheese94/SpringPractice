package com.javaex.lec;

public class BMICalculator {
double weight;
double height;
double overweight;
double lowweight;

public void bmitesting(double weight, double height) {
	this.weight = weight;
	this.height = height;
	System.out.println("귀하는"+(overweight - weight)+"입니다.");
}
public void setOverweight(double overweight) {
	this.overweight = overweight;
}
public void setLowweight(double lowweight) {
	this.lowweight = lowweight;
}


	
}
