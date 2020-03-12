package com.cg.java.dto;

public class Emp {
	private String empNm;
	private int empNo;
	private float empSal;
	public Emp(String empNm, int empNo, float empSal) {
		///super();
		this.empNm = empNm;
		this.empNo = empNo;
		this.empSal = empSal;
	}
	
	public String toString(){
		return "[empNo = "+this.empNo+", empName = "+this.empNm +", empSal = "+this.empSal+"]+\n";
	}
}
