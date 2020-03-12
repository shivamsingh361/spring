package com.cg.java.services;

import org.springframework.beans.factory.annotation.Autowired;

public class EmpServices {
	private String companyName;
	private String address;
	private SalaryServices services;
	private float yrlyPackage;

	public EmpServices(String companyName, String address, float yrlyPackage) {
		super();		
		System.out.println("In Three para constuctor");
		this.companyName = companyName;
		this.address = address;
		this.yrlyPackage = yrlyPackage;
	}

	public EmpServices(String companyName, String address) {
		super();
		System.out.println("In Two para constuctor");
		this.companyName = companyName;
		this.address = address;
	}
	
	public String getAddress() {	//address: property name
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public EmpServices(){
		System.out.println("Hello");
	}
	public String getMessage(){
		System.out.println(services.calcSalary());
		return "Welcome to Spring Training." + companyName;
	}
	
	public String getCompanyName() {	//companyName: property name
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public SalaryServices getServices(){
		return this.services;
	}
	public void setServices( SalaryServices services){
		this.services = services;
	}
}
