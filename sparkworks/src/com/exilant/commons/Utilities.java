package com.exilant.commons;

import org.apache.spark.api.java.JavaRDD;

public class Utilities {

	public static void printStringRDD(JavaRDD<String> stringRDD,int limit){
		for (String temp : stringRDD.take(limit)) {
			System.out.println(temp);
			
		}
		System.out.println("-------------");
	}
	
	public static void printIntegerRDD(JavaRDD<Integer> integerRDD,int limit){
		for (Integer temp : integerRDD.take(limit)) {
			System.out.println(temp);
			
		}
		System.out.println("-------------");
	}
	
	public void hold(){
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			e.printStackTrace();
			}
			
		}
	}
	
	
	
}
