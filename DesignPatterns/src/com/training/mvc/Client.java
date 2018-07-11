package com.training.mvc;

public class Client {
public static void main(String[] args) {
	Employee model=retrieve();
	StarView view=new StarView();
	DashView view1=new DashView();
	
	EmployeeController controller=new EmployeeController(model, view);
	controller.updateView("star");
}
private static Employee retrieve(){
	return new Employee(101,"vamsi");
}
}
