package com.springt.aop.banking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspectAround {
	
	
	@Around("execution(public * get*())")
public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
	
	
	Object retVal=null;
	try {
		System.out.println("before job");
		retVal=proceedingJoinPoint.proceed();
		System.out.println("After job");
	} catch (Throwable e) {
		e.printStackTrace();
	}
	return retVal;
}
}
