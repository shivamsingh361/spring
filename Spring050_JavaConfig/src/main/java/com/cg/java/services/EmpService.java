package com.cg.java.services;

import java.util.List;

import com.cg.java.dao.EmpDao;
import com.cg.java.dto.Emp;
import com.cg.java.exceptions.EmpException;

public interface EmpService {
	public  List<Emp> getEmpList() throws EmpException;
	public void setDao(EmpDao dao);
	public EmpDao getDao();

}
