package com.cg.java.tests;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.cg.java.exceptions.EmpException;
import com.cg.java.services.EmpService;
import com.cg.java.services.EmpServiceImpl;

public class EmpTest {

	public EmpTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springCore.xml");
		
		EmpService obj = (EmpServiceImpl) ctx.getBean("empService", EmpService.class);
		
		try {
			System.out.println(obj.getEmpList());
		} catch (EmpException e1) {
			e1.printStackTrace();
		}
	}

}
