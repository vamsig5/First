package com.springt.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspectAfter {
//@After("execution(* get*(..))")
//public void afterGetter(){
//	System.out.println("#####After Advise Invoked######");
//}

@AfterReturning("execution(* com.springt.aop.model.*.getAcc())")
public void afterSuccessfulGetter(){
	System.out.println("#####After success Invoked######");	
}

@AfterReturning(pointcut="args(val)", returning="returnString")
public void afterReturnStringSetter(String val,String returnString){
	System.out.println("After invoke "+val+" ,return-> "+returnString);
}

@AfterThrowing("execution(* throw*())")
public void AfterExecution(){
	System.out.println("this invoked for all exceptions");
}
}
