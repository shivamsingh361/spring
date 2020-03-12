package com.cg.core.config;

import java.beans.PropertyDescriptor;
 
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import com.cg.core.dao.EmpDao;
import com.cg.core.dao.EmpDaoImpl;


/*
 * The BeanPostProcessore are created before all other beans.
 * The postProcessBeforeInstantation() is called for creating EmpDao.
 * If this method returns instance of EmpDaoImpl, bean is created.
 * If this method returns null, spring invokes spring invokes its iwn bean creation mechanism and create a bean.
 * 
 * BeanPostProcessor
 * 		postProcessBeforeInitialization()
 * 		postProcessAfterInitialization()
 * 
 * InstantiationAwareBeanPostProcessor extends from BeanPostProcessor
 * 		postProcessBeforeInstantiation(): Works as Object factory.
 * 			If it returns null, spring invokes spring invokes its own bean creation mechanism and create a bean.
 * 		postProcessAfterInstantiation():
 * 			returns 'true'	:Does Data injection.
 * 			returns 'false'	:Bypasses Data injection, This is called as 
 * 		postProcessProperties()
 * 		postProcessPropertyValues()
 */


@Component
public class BeamProcessorsImpl  implements InstantiationAwareBeanPostProcessor {
	
	//1.
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		//Logic to create programmatically crate a bean can go here.
		System.out.println(beanClass.getName()+ ":\t" + beanName);
		/*if(beanName.equals("empDao")){
			EmpDao dao = new EmpDaoImpl();
			return dao;	
		}*/
			return null;
	}
	
	//2.
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println(">> In postProcessAfterInstantiation()");
		return true;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(">> In postProcessBeforeInitialization()");
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(">> In postProcessAfterInitialization()");
		return bean;
	}

	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		System.out.println("postProcessPropertiesValues()");
		return pvs;
	}

	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessProperties()");
		return pvs;
	}


}
