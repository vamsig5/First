package com.training.abstractfactory;
public class FactoryProducer {
	  //if it is not static the every time instance is created
  // this kind of method  known as resource 
 public static AbstractFactory getFactory(String factoryName){
	 if(factoryName.equals("vehicle")){
		 return new VehicleFactory();
	 }else if(factoryName.equals("color")){
		 return new ColorFactory();
	 }
	return null;
 }
}
