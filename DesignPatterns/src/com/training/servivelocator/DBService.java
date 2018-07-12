package com.training.servivelocator;

public class DBService implements Service{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "db";
	}

	@Override
	public void execute() {
System.out.println("Executing DBService");		
	}

}
