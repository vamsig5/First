package com.exilant.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
public static void main(String[] args) {
	Predicate<Integer> greaterThan=i->i>10;
	Predicate<Integer> lesserThan=i->i<10;
	Predicate<Integer> positiveNum=i->i>0;
	Predicate<Integer> betweenRange=i->i>0 && i<100;
	System.out.println(greaterThan.test(1));
	System.out.println("------------------------");

	List<Integer> integers=Arrays.asList(12,23,34,45,56,78,-33,-55,2,-77,132,143);
	List<Integer> gt10list=filtered(integers, greaterThan);
	System.out.println("number gt 10");
	System.out.println("------------------------");
	gt10list.forEach(System.out :: println);
	List<Integer> lt10list=filtered(integers, lesserThan);
	System.out.println("number lt 10");
	System.out.println("------------------------");

	lt10list.forEach(System.out :: println);
	List<Integer> positNum=filtered(integers, positiveNum);
	System.out.println("number +ve num");
	System.out.println("------------------------");

	positNum.forEach(System.out :: println);
	List<Integer> numRange=filtered(integers, betweenRange);
	System.out.println("number b/w Range");
	System.out.println("------------------------");

	numRange.forEach(System.out :: println);
}
public static List<Integer> filtered(List<Integer> numbers,Predicate<Integer> predicate){
	List<Integer> filtered=new ArrayList<Integer>();
	for ( Integer integer : numbers) {
		if(predicate.test(integer)){
			filtered.add(integer);
		}
		
	}
	return filtered;
}
}
