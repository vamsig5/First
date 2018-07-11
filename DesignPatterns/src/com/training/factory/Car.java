package com.training.factory;

public class Car {

	public static Car getCar(CarName carName){
		if(carName==CarName.MARUTI){
		return new Maruti();
		}else if (carName==CarName.AUDI) {
			return new Audi();
		}else if(carName==CarName.BMW){
			return new BMW();
		}
		return null;
		
	}
	public void drive() {
		System.out.println("driving car");
	}
}
