package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lamdab1 {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(12,22,44,56,78);
		//till jdk1.5
		for (int i = 0; i < args.length; i++) {
			System.out.println(list1.get(i));
		}
		
		//till jdk1.7
		for (Integer integer : list1) {
		System.out.println(integer);	
		}
		//from jdk1.8
		System.out.println("---------with lambda-----------");
		list1.forEach((Integer temp)->System.out.println(temp));
		 
		//behind the screen
		System.out.println("-----with consumer--------");
		list1.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});
		 
		
		//in lambda way 1.8
		System.out.println("-------in lambda way (01)------");
		list1.forEach(x->System.out.println(x));
		
		//using the method references
		System.out.println("-------in lambda way (02)------");
		list1.forEach(System.out :: println);
		
		//sum in jdk1.7
		System.out.println("------sum in jdk1.7");
		int sum=0;
		for (Integer integer : list1) {
			sum+=integer*2;
		}
		System.out.println("result "+sum);
		
		//sum in jdk1.8
		System.out.println("-------in jdk1.8-------");
         System.out.println(list1.stream().map(e->e*2).reduce((res,e)->res+e));
		
	}

}
