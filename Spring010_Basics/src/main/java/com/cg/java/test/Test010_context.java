package com.cg.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.java.services.EmpServices;
import com.cg.java.services.SalaryServices;
/*
 * The bean and Beans tags come from spring-beran.xsd.
 * The bean tag takes atleast two attributes,,,
 * The ClasspathXmlApplicationContext is a spring implementing interface  ApplicationContext.
 * Beans are of two types : Singleton and Prototype.
 * 	Singleton : Object created only once.(By default it is singleton.)
 * 	Prototype : Object created as and when required.
 * 
 * Bean creation:
 * 	Eager: All beans are created at the time of creation of spring context.
 * 	Lazy: Beans are created on demand.
 * 	Prototype beans are always created lazily.
 * 	Singleton: Eagerly/Lazily.
 */
public class Test010_context {

	public static void main(String[] args) {
		
		// 1. Create Spring Context , Spring Container.
		//BeanFactory factory = new XmlBeanFactory();
		// The ApplicationContext is modified version of BeanFactory.
		//From Spring 4.3 onwards, BeanFactory is deprecated.
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springCore.xml");
		
		System.out.println("***********************");
		EmpServices services1 = (EmpServices)ctx.getBean("empServices");
		EmpServices services2 = (EmpServices)ctx.getBean("empServices");
		
		System.out.println(services1.getMessage());
		System.out.println(services2.getMessage());
//		System.out.println(services2.getAddress());
//		services1.setAddress("Hingewadi");
//		System.out.println(services1.getAddress());
		// services object is singleton by default.
		
		//SalaryServices services3 = (SalaryServices)ctx.getBean("salServices");
		//System.out.println(services3.calcSalary());
	}
}
