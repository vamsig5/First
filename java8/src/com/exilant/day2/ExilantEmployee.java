package com.exilant.day2;

public class ExilantEmployee implements IEmployee ,IDepartment{

	@Override
	public void salary() {
System.out.println("The salary is decided by the project work");		
	}

	@Override
	public void workLocation() {
		System.out.println(" ework location is varied");
	}

	@Override
	public void noOfHrs() {
		IEmployee.super.noOfHrs();
	}

//	@Override
//	public void noOfHrs() {
//		IDepartment.super.noOfHrs();
//	}

}
