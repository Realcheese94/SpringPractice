package com.lec.javaex;

public class Calculator {
	private int firstnum;
	private int secondnum;
	
	public void setFirstnum(int firstnum) {
		this.firstnum = firstnum;
	}
	
	public int getFirstnum()
	{
		return this.firstnum;
	}
	public void setSecondnum(int secondnum) {
		this.secondnum = secondnum;
	}
	
	public int getSecondnum()
	{
		return this.secondnum;
	}
	
	public void add() {
		System.out.println("add()");
		System.out.println("a + b = "+(this.firstnum + this.secondnum));
		
	}
	public void sub() {
		System.out.println("sub()");
		System.out.println("a - b = "+(this.firstnum - this.secondnum));
		
	}
	public void mul() {
		System.out.println("mul()");
		System.out.println("a * b = "+(this.firstnum * this.secondnum));
		
	}
	public void div() {
		System.out.println("div()");
		System.out.println("a + b = "+(this.firstnum / this.secondnum));
		
	}


}
