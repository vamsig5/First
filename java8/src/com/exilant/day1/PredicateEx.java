package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {

	public static void main(String[] args) {
		Predicate<Customer> purgt6000=i->i.getCustPurchases()>6000;
		List<Customer> customers=Arrays.asList(
				new Customer(101,"Vamsi",6000,"Engineer"),
				new Customer(102,"Uma",5000,"Developer"),
				new Customer(103,"Hanu",7000,"Lead"),
				new Customer(104,"Kavita",5600,"Engineer"),
				new Customer(105,"Rama",7500,"Developer")
				);
		List<Customer> custPurGt=filtered(customers, purgt6000);
		custPurGt.forEach(System.out :: println);
		List<Customer> EngPurGt5k=filtered(customers, isEngineerGT5k());
		EngPurGt5k.forEach(System.out :: println);
	}
	public static List<Customer> filtered(List<Customer> customers,Predicate<Customer> predicate){
		//List<Customer> filtered=new ArrayList<Customer>();
//		for ( Customer customer : customers) {
//		if (predicate.test(customer)) {
//			filtered.add(customer);
//		}
//			
//		}
//		return filtered;
		return customers.stream().filter(predicate).collect(Collectors.<Customer>toList());
	}
	public static Predicate<Customer> isEngineerGT5k(){
		return p->p.getDesignation().equals("Engineer")&& p.getCustPurchases()>5000;
	}

}
