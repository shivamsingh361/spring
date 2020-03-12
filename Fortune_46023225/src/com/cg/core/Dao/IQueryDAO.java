package com.cg.core.Dao;



import com.cg.core.Exception.QueryException;
import com.cg.core.dto.QueryDTO;



public interface IQueryDAO {
	public QueryDTO getQueryList(int queryId) throws QueryException;
}
