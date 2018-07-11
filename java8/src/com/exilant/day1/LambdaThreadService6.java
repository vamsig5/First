package com.exilant.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadService6 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi in Ananymous block");				
			}
		});
		executorService.shutdown();
		
		///java 8 way\
		ExecutorService executorService2=Executors.newSingleThreadExecutor();
		executorService2.execute(()->System.out.println("Hi in Lambda"));
		executorService2.shutdown();
		System.out.println("---callables work");
		ExecutorService executorService3=Executors.newSingleThreadExecutor();
		Set<Callable<String>> callables=initializeCallables();
//		String result=executorService3.invokeAny(callables);
//		System.out.println("result:"+result);
		List<Future<String>> result=executorService3.invokeAll(callables);
		for (Future<String> future : result) {
		
			System.out.println(future.get());
		}
		executorService3.shutdown();
	}
	 public static Set<Callable<String>> initializeCallables(){
		 Set<Callable<String>> callables=new HashSet<Callable<String>>();
		 callables.add(()->"1st Callable");
		 callables.add(()->"2nd Callable");
		 callables.add(()->"3rd Callable");
		 callables.add(()->"4th Callable");
		 callables.add(()->"5th Callable");
		 callables.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
								return " callable thread in ananymous class";
			}
		});
		 callables.add(()->{return"complex called business logic";});
		 return callables;
	 }

}
