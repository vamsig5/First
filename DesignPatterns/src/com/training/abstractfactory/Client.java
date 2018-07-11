package com.training.abstractfactory;

public class Client {
	public static void main(String[] args) {
		
	
	AbstractFactory vehiclefactory=FactoryProducer.getFactory("vehicle");
	IColor redColor=FactoryProducer.getFactory("color").getColor("red");
	IVehicle fordCar = vehiclefactory.getVehicle("car");
	
	fordCar.move();
	}

}
