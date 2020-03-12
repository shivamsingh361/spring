package com.cg.java.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.java.dto.Emp;
import com.cg.java.exceptions.EmpException;
@Component//("empDao")
public class EmpDaoImpl implements EmpDao{

	@Override
	public List<Emp> getEmpList() throws EmpException {
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp("Shivam" , 1, 23000));
		empList.add(new Emp("Shashank", 2, 23000));
		empList.add(new Emp("Aditya", 3, 23000));
		return empList;
	}

}
