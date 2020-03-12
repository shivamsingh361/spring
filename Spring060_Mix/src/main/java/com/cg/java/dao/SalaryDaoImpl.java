package com.cg.java.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.java.dto.EmpSal;
import com.cg.java.exceptions.EmpException;

public class SalaryDaoImpl implements SalaryDao{

	@Override
	public List<EmpSal> getEmpSal() throws EmpException {
		List<EmpSal> empSalList = new ArrayList<EmpSal>();
		
		empSalList.add(new EmpSal(1, 4500, 500));
		empSalList.add(new EmpSal(2, 4300, 700));
		empSalList.add(new EmpSal(3, 4400, 600));
		return empSalList;
	}

}
