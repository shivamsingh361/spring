package com.cg.java.services;

import org.springframework.stereotype.Component;

@Component("salServices")
public class SalaryServices {
	public SalaryServices(){
		System.out.println("Obj SalaryService constucted.");
	}
	public float calcSalary(){
		return 800000; 
	}
}
