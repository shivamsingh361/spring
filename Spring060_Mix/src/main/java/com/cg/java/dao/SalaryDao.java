package com.cg.java.dao;

import java.util.List;

import com.cg.java.dto.EmpSal;
import com.cg.java.exceptions.EmpException;

public interface SalaryDao {
	public List<EmpSal> getEmpSal()  throws EmpException;
}
