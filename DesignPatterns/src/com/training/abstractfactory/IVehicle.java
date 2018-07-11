package com.training.abstractfactory;

public interface IVehicle {
void move();
void speed( int maxspeed);
void paint(IColor color);
}
class Car implements IVehicle{

	@Override
	public void move() {
System.out.println("car is moving");		
	}

	@Override
	public void speed(int maxspeed) {
		System.out.println("max speed of car is "+maxspeed);
		
	}
	public void paint(IColor color){
		color.paintCar();
	}
	
}
class Truck implements IVehicle{

	@Override
	public void move() {
		System.out.println("truck is moving");
		
	}

	@Override
	public void speed(int maxspeed) {
		System.out.println("max speed of truck is "+maxspeed);
		
	}

	@Override
	public void paint(IColor color) {
		color.paintCar();
	}
	
}