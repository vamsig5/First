package com.training.abstractfactory;
//here you will have the list of factories to be exposed
public abstract class AbstractFactory {

	public abstract IVehicle getVehicle(String vehicle);
	public abstract IColor getColor(String color);
}
