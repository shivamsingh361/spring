package com.cg.java.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.java.dto.Emp;
import com.cg.java.exceptions.EmpException;

@Repository("EmpDao")
public interface EmpDao {
	public List<Emp> getEmpList()  throws EmpException;
}
