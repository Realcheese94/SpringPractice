package com.spring2;

public class Worker {
	private String name;
	private String departname;
	private String tel;
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDepartname() {
		return departname;
	}




	public void setDepartname(String departname) {
		this.departname = departname;
	}




	public String getTel() {
		return tel;
	}




	public void setTel(String tel) {
		this.tel = tel;
	}




	public void getWorkerInfo() {
		System.out.println("Worker's name is"+this.name);
	}

}
