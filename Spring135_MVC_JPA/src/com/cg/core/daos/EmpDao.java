package com.cg.core.daos;


import java.util.List;

import com.cg.core.dto.EmpEntity;
import com.cg.core.exceptions.EmpException;

public interface EmpDao {
	public List<EmpEntity> getEmpList() throws EmpException;
	public EmpEntity insertNewEmp(EmpEntity emp) throws EmpException;
}
