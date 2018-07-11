package com.training.mvc;

public class EmployeeController {
Employee model;
StarView view;

public EmployeeController(Employee model, StarView view) {
	super();
	this.model = model;
	this.view = view;
}

public void updateView(String viewType){
	System.out.println("sowing in"+viewType+" view");
	view.printEmployee(model);
}
}
