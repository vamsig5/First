package com.training.servivelocator;

public class Client {

	public static void main(String[] args) {
	
		Service dbService=ServiceLocator.getService("db");
		dbService.execute();
		System.out.println("--------------");
	
	Service erService=ServiceLocator.getService("erp");
	erService.execute();
	System.out.println("------------------");
	
	dbService=ServiceLocator.getService("db");
	dbService.execute();
	
	}

}
