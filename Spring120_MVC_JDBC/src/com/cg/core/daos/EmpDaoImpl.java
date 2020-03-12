 package com.cg.core.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<EmpEntity> getEmpList() throws EmpException {
		
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		String qry = "SELECT EMPNO, ENAME, SAL FROM EMP";
		List<EmpEntity> empList = new ArrayList();
		try {
			connect=dataSource.getConnection();
			stmt=connect.createStatement();
			rs = stmt.executeQuery(qry);
			while(rs.next()){
				int empNo = rs.getInt("EMPNO");
				String name = rs.getString("ENAME");
				float sal = rs.getFloat("SAL");
				//System.out.println(empNo);
				EmpEntity emp = new EmpEntity(empNo, name, sal);
				empList.add(emp);
			}
		} catch (SQLException e) {
			throw new EmpException("Error While procuring data.", e);	// Exception Chaining
		} finally{
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (connect != null) {
					connect.close(); // It will return  the connection back to pool;
				} 
			} catch (SQLException e2) {
				throw new EmpException("Error wihle Closing the connection!", e2);
			}
		}
		System.out.println(empList);
		return empList;
	}
	

}
