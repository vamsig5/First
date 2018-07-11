package com.training.mvc;

public class DashView {
	public void printEmployee(Employee e){
		System.out.println("#######################");
		System.out.println(e.getEmpId()+" "+e.getEmpName());
		System.out.println("##########################");
		
	}
}
