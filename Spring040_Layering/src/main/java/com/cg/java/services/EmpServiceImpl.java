package com.cg.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.java.dao.EmpDao;
import com.cg.java.dto.Emp;
import com.cg.java.exceptions.EmpException;
@Component("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao dao;
	@Override
	public List<Emp> getEmpList() throws EmpException {
		
		return dao.getEmpList();
	}
}
