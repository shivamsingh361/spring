package com.cg.java.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*
 * @PostContruct: A annotation given by java.
 * 		It declare init method for bean.
 * 		After creating a bean , Spring context all this method automatically.
 * 		This approach allows naming the method suitable to domain activity.
 * 
 * @PreDestoy: An annotation given by java.
 * 		It declares a finalizing method for a bean.
 * 		At  the time of beam being removed from Spring Context,
 * 			this method is automatically called. It is to clean resources.
 * 		Method name can be different as per aim of the method.
 * 
 * Both annotation come from javax.annotaion
 * Both idea should be preferred over use of Spring Bean Life-cycle interfaces. 
 * Both are method level annotation.
 * 
 * @Scope: To declare 'singleton' or 'prototype' for a bean.
 * @Scope("singleton") or @Scope("prototype")
 * 
 * Each bean by default is created Eagerly i.e at the time of creation of bean.
 * @Lazy(false): By default creates bean eagerly.
 * @Lazy(true): Creates a bean lazily only on demand.
 * 
 * @Component: To declare a bean.
 * 	The sub-annotations are for documentation purpose.
 * 		@Repository:	To declare DAO classes as bean.
 * 		@Service:		To declare BL(Business Logic)/Service bean.
 * 		@Controller:	An annotation to declare controlling classes in spring MVC.
 * 		@RestController:An annotation to declare REST  services from a class in Spring REST.
 */
@Component("empServices")
@Scope("singleton")
@Lazy(true)
public class EmpServices { //implements InitializingBean, DisposableBean{
	@Value("Capgemini, Pune")
	private String companyName;
	@Value("Talwade")
	private String address;
	
	//@Autowired
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
