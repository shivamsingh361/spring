package com.cg.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.cg.java.dao.EmpDao;
import com.cg.java.dao.EmpDaoImpl;
import com.cg.java.services.EmpService;
import com.cg.java.services.EmpServiceImpl;

/*
 * @Configration: Class level. Declares a class as configuration class.
 * @Bean: Method level. Declares a method as factory level.
 * 		Method responsible for creating , initializing  an object is a Factory Method.
 * 
 * The @Lazy() and @Scope are also allowed on factory methods. 
 * 
 */
@Configuration
public class ProjectConfig {
	
	
	//Factory method for EmpDaoImpl
	@Bean("empDao")
	//@Lazy(true)
	//@Scope("prototype")
	public EmpDao getEmpDao(){
		System.out.println("EmpDao Bean Craeted!");
		return new EmpDaoImpl();
	}
	
	
	@Bean("empService")
	public EmpService getEmpService(){	
		System.out.println("EmpService Bean Craeted!");
		EmpService service = new EmpServiceImpl();
		return service;
	}
	

	

}
