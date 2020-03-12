package com.cg.java.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*
 * The interface InitilizingBean imposes implementation of method
 * 		afterPropertiesSet(). This method calls automatically after setting all 
 * 		of all properties.
 * 
 * The interface DisposableBean imposes implementation of method destroy()
 * 		this method gets automatically called while bean is removed from 
 * 		Spring Context.
 * 
 * */
@Component("empServices")
public class EmpServices { //implements InitializingBean, DisposableBean{
	@Value("Capgemini, Pune")
	private String companyName;
	@Value("Talwade")
	private String address;
	
	@Autowired
	private SalaryServices services;
	
	@Value("800000")
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
		return "Welcome to Spring Training." + companyName ;
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
	
	@Autowired
	//@Qualifier("salServices")
	public void setServices( SalaryServices services){
		System.out.println("OKOK");
		this.services = services;
	}
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("In afterPropertiesSet()");
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("In Destroy method()");
	}
}
