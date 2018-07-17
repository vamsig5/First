package com.springt.bpp;

import org.aspectj.weaver.patterns.IfPointcut.IfFalsePointcut;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.springt.employee.Employee;

//if we want spring to know this is post processor
//implements bean postprocessor,this way every bean
//when created by spring has to go through this class
//since this class class can handle any class/s are given as object
public class EmpBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postprocessor afterIntialization-"+arg0);		
		if (arg0 instanceof Employee) {
			Employee emp=(Employee) arg0;
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		
		
		
		return arg0;
	}


	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postprocessor before Intialization "+arg1);
		if (arg0 instanceof Employee) {
			Employee emp=(Employee) arg0;
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		return arg0;
	}

}
