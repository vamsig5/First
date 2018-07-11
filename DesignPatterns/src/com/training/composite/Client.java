package com.training.composite;

public class Client {

	public static void main(String[] args) {
		Customer customer1=new Customer(101, "vamsi");
		Customer customer2=new Customer(102, "hanu");
		Customer customer3=new Customer(103, "uma");
	Customer customer4=new Customer(104, "kavita");
//		Customer customer5=new Customer(105, "rama");
//		Customer customer6=new Customer(106, "ravi");
//		Customer customer7=new Customer(107, "naveen");
//		Customer customer8=new Customer(108, "krishna");
//		Customer customer9=new Customer(109, "kittu");
//		Customer customer10=new Customer(110, "vamc");
		System.out.println(customer2);
		customer1.addReference(customer2);
		customer1.addReference(customer3);
		customer2.addReference(customer4);
//		customer2.addReference(customer5);
//		customer2.addReference(customer7);
//		customer3.addReference(customer6);
//		customer5.addReference(customer10);
//		customer5.addReference(customer8);
//		customer4.addReference(customer9);
		
		System.out.println("print all customer reference tree");
		System.out.println("customer !'s reference "+customer2.getReferences());
		
		for (Customer temp :customer2.getReferences()) {
			System.out.println(temp.getCustId()+"  "+temp.getCustName());
		}
		
	}
	

}
