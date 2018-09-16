package com.lec.spring1;

public class MyCalculator {
private Calculator calculator;
private int firstnum;
private int secondnum;

public MyCalculator() {
	
}

public void add() {
	calculator.addC(firstnum,secondnum);
}
public void sub() {
	calculator.subC(firstnum,secondnum);
}
public void div() {
	calculator.divC(firstnum,secondnum);
}
public void mul() {
	calculator.mulC(firstnum,secondnum);
}

public void setCalculator(Calculator calculator) {
	this.calculator = calculator;
}
}
