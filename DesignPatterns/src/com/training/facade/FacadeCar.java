package com.training.facade;

public class FacadeCar {
private HatchBack hb;
private SUV suv;
private Sedan sedan;
public FacadeCar() {
	
	this.hb = new HatchBack();
	this.suv = new SUV();
	this.sedan = new Sedan();
}

public void hatchBackDriver(){
	hb.drive();
}
public void suvDriver(){
	suv.drive();
}
public void sedanDriver(){
	sedan.drive();
}
}
