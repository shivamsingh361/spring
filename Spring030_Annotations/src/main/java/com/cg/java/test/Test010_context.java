package com.cg.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.java.services.EmpServices;
import com.cg.java.services.SalaryServices;
/*
 * tHE BEAN DECLARATION IS DONE USING @cOMPONENT.
 * The initial value can be hard-coded using @value.
 * there are 3 types of injection...
 * The filed Injection L Give @Autowired to field.
 * The constructor Injection :Give@Autowired
 * The setter injection:
 * the value method injection:
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
		
		SalaryServices services3 = (SalaryServices)ctx.getBean("salServices");
//		System.out.println(services3.calcSalary());
		ConfigurableApplicationContext cctx = (ConfigurableApplicationContext) ctx;
		cctx.close();
	}
}
