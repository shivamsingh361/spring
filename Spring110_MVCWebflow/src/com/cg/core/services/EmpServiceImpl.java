package com.cg.core.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Service
@Scope("singleton")
public class EmpServiceImpl implements EmpServices{
	@Override
	public String authenticates(String userName, String password) {
		if(userName.equals("Admin") && password.equals("admin"))
			return "Valid Details Mr./Ms./Mrs. ABC";
		else
			return null;
	}

}
