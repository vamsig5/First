package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort5 {
	public static void main(String[] args) {
		List<Customer> customers=Arrays.asList(
				new Customer(101,"Vamsi",6000,"Engineer"),
				new Customer(102,"Uma",5000,"Developer"),
				new Customer(103,"Hanu",7000,"Lead"),
				new Customer(104,"Kavita",5600,"Engineer"),
				new Customer(105,"Rama",7500,"Developer"),
				new Customer(106,"naveen",6670,"Developer")
				);
		System.out.println("--Before sort---------");
		customers.forEach(System.out :: println);
		
		//jdk 1.7
		Collections.sort(customers, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getCustName().compareTo(o2.getCustName());
			}
		});
		
		System.out.println("--After sort based on name---------");
		customers.forEach(System.out :: println);
		//////////////////using java 8
		customers.sort((Customer c1, Customer c2)->c1.getCustName().compareTo(c2.getCustName()));
		System.out.println("--After sort based on name using java 8---------");
		customers.forEach(System.out :: println);
		
		///java8   way
		customers.sort((Customer c1, Customer c2)->(int)(c1.getCustPurchases()-c2.getCustPurchases()));
		System.out.println("--After sort based on purchase---------");
		customers.forEach(System.out :: println);
		
		customers.sort((Customer c1, Customer c2)->c1.getDesignation().compareTo(c2.getDesignation()));
		System.out.println("--After sort based on designation---------");
		customers.forEach(System.out :: println);
		
		
		  Comparator<Customer> customerComparator=(c1,c2)->c1.getCustName().compareTo(c2.getCustName());
		  //Collections.sort(customers, customerComparator);
		  customers.sort(customerComparator);
		  System.out.println("--After sort based on name (ASC)---------");
			customers.forEach(System.out :: println);
			
			customers.sort(customerComparator.reversed());
			System.out.println("--After sort based on name (DSC)---------");
			customers.forEach(System.out :: println);
		  
	}

}
