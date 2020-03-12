package com.cg.core.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository("EMpDao")
public class EmpDaoImpl implements EmpDao{
	@Value("10")
	private int value;
	
	@Autowired
	private SalaryDao dao;
	
	public EmpDaoImpl(){
		System.out.println("Emp Dao created!");
	}
	
	@Override
	public String toString() {
		return "EmpDaoImpl [value=" + value + "]";
	}

}
