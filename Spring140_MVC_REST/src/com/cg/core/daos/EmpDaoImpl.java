 package com.cg.core.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.core.dto.EmpEntity;
import com.cg.core.exceptions.EmpException;

/*
 * Using connection pool in always a best practice instead of managing single connect 
 * Spring support javax.sql.DataSource which is manager for pool of Connections.
 * A DataSourceManager in Spring gives ready connection pool and DataSource.
 * 
 */
@Repository
public class EmpDaoImpl implements EmpDao {
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<EmpEntity> getEmpList() throws EmpException {
		
		
		String strQry = "FROM EmpEntity";
		List<EmpEntity> empList = null;
		try {
			Query qry = manager.createQuery(strQry, EmpEntity.class);
			empList = qry.getResultList();
			//System.out.println(empList);
		} catch (Exception e) {
			throw new EmpException("Error While procuring data.", e);	// Exception Chaining
		}
		return empList;
	}
	

}
