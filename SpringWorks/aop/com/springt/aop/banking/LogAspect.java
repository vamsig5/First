package com.springt.aop.banking;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {
//this will scan for any package
	
	//to specify the method
	//@Before("execution(public double getBalance())")
	///we can also have fully Qualified name
	//@Before("execution(public double com.springt.aop.model.CAAccount.showBalance() )")
	
	//regular expression to log all getters
	//@Before("execution(public * get*())")
	//@Before("execution( * get*(*))")
	
	
	//log all getters either with or without parameters
	//@Before("execution( * get*(..))")
	//any return type in any class of package given
	@Before("execution( * com.springt.aop.model.*.getBalance())")
	public void loggingAdviceBefore(){
		System.out.println("*******Loggging Before called*********");
	}
	@Pointcut("execution( * get*(..))")
	public void allGetters(){
		System.out.println("this data not displayed");
	}
	@Before("allGetters()")
	public void secondAspect(){
		System.out.println("invoke all getters");
	}
	@Pointcut("execution( * com.springt.aop.model.SBAccount.getAcc())")
	public void allGettersSBAccount(){
		System.out.println("this data not displayed");
	}
	@Before("allGettersSBAccount()")
	public void secondAspectForSBAccount(){
		System.out.println("invoke only for SBAccount");
	}
	
	@Before("allGetters() || allGettersSBAccount()")
	public void compoundAspect(){
		System.out.println("this is compound advice for or clause of getters and sbAccount");
	}
}
