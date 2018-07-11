package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// to show the working of map and filter based on the Customer type
public class StreamMap02 {
	
	//syntax is upto jdk 1.7
	public static List<PriorityCustomer> filterCustomers(List<Customer> customers){
		List<PriorityCustomer> priorityCustomers=new ArrayList< >();
		for (Customer temp : customers) {
			if(temp.getCustPurchases()>6000){
				priorityCustomers.add(new PriorityCustomer(temp.getCustid(),temp.getCustName(),"Gold"));
			}
		}
				return priorityCustomers;
		
	}
	//syntax using jdk1.8
	public static List<PriorityCustomer> filterCustomers1(List<Customer> customers){
		List<PriorityCustomer> priorityCustomers=customers.stream().map(temp->{
		if (temp.getCustPurchases()>=7000) {
			return new PriorityCustomer(temp.getCustid(),temp.getCustName(),"Platinum");
			
		}else if (temp.getCustPurchases()<7000 && temp.getCustPurchases()>=6000) {
			return new PriorityCustomer(temp.getCustid(),temp.getCustName(),"Gold");
		}else {
			return new PriorityCustomer(temp.getCustid(),temp.getCustName(),"silver");
		}
			
		}).collect(Collectors.toList());
		return priorityCustomers;
		
	}
	
	
	
	////////////////////////////
	
	public static List<PriorityCustomer> filterCustomers3(List<Customer> customers){
		List<PriorityCustomer> priorityCustomers=customers.stream().map(temp->{
	return new PriorityCustomer(temp.getCustid(),temp.getCustName(),temp.getCustPurchases()>0&&temp.getCustPurchases()<6000?"silver":temp.getCustPurchases()>6000&&temp.getCustPurchases()<7000?"Gold":"Platinum");
	
		}).collect(Collectors.toList());
		return priorityCustomers;
		
	}
	
	//-----------using filters ------------------------
	public static List<PriorityCustomer> filterCustomers2(List<Customer> customers){
	return customers.stream().filter(temp->temp.getCustPurchases()>6000).map(temp->{
		return new PriorityCustomer(temp.getCustid(),temp.getCustName(),"Gold");

	}).collect(Collectors.toList());
	
	}
	//////////////////////////////
	
	
	

	public static void main(String[] args) {
		List<Customer> customers=Arrays.asList(
				new Customer(101,"Vamsi",6000,"Engineer"),
				new Customer(102,"Uma",5000,"Developer"),
				new Customer(103,"Hanu",7000,"Lead"),
				new Customer(104,"Kavita",5600,"Engineer"),
				new Customer(105,"Rama",7500,"Developer")
				);
		filterCustomers(customers).forEach(System.out :: println);
		
		System.out.println("------using jdk 1.8----------");
		filterCustomers1(customers).forEach(System.out :: println);
		System.out.println("-----using filters--------");
		filterCustomers2(customers).forEach(System.out :: println);
		System.out.println("--------using tri condition");


	}

}
