package com.exilant.day2;
//all business logic go here
public class Runner {
	public int execute(String s1,String s2,WorkerInterface workerInterface) {
		System.out.println("In Execute Method");
		
		return workerInterface.doSomeWork(s1, s2);
	}

}
