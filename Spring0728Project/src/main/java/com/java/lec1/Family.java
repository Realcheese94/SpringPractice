package com.java.lec1;

public class Family {

	private String papaname;
	private String maminame;
	private String broname;
	private String sisname;
	public Family(String papaname,String maminame) {
		this.papaname = papaname;
		this.maminame = maminame;
	}
	public String getPapaname() {
		return papaname;
	}
	public void setPapaname(String papaname) {
		this.papaname = papaname;
	}
	public String getMaminame() {
		return maminame;
	}
	public void setMaminame(String maminame) {
		this.maminame = maminame;
	}
	public String getBroname() {
		return broname;
	}
	public void setBroname(String broname) {
		this.broname = broname;
	}
	public String getSisname() {
		return sisname;
	}
	public void setSisname(String sisname) {
		this.sisname = sisname;
	}
	
}
