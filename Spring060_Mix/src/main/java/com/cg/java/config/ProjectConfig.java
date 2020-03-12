package com.cg.java.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.cg.java.dao.EmpDao;
import com.cg.java.dao.EmpDaoImpl;


/*
 * @Configration: Class level. Declares a class as configuration class.
 * @Bean: Method level. Declares a method as factory level.
 * 		Method responsible for creating , initializing  an object is a Factory Method.
 * 
 * The @Lazy() and @Scope are also allowed on factory methods. 
 * 
 * THREE approaches for bean configuration
 * 1. XML Configuration.
 * 		Bean is declare using <bean> in Spring XML configuration.
 * 		Do not declare bean with annotation, componentScan and factory method.
 * 
 * 2. Annotation: (@Component-@Repository-@Services).
 * 		Mention in Component scan either in Java Config or in XML.
 * 		Do not declare bean in XML and Factory Method.
 * 
 * 3. Factory Method in javaConfig class
 * 		Create a factory method in Java config class.
 * 		Do not annotate bean and thus no ComponentScan.
 * 		Do not declare bean with <bean> in XML configuration.
 * 
 * 
 * @ComponentScan: To mention packages to scan for annotated classes.
 * @ImportResources: To import XML configuration.
 * 
 */
@Configuration
@ComponentScan("com.cg.java.services")
@ImportResource("springCore.xml")
public class ProjectConfig {
	
	//Factory method for EmpDaoImpl
	@Bean("empDao")
	//@Lazy(true)
	//@Scope("prototype")
	public EmpDao getEmpDao(){
		System.out.println("EmpDao Bean Craeted!");
		return new EmpDaoImpl();
	}
	

}
