package com.training.servivelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
private List<Service> services;
public Cache(){
	services=new ArrayList<Service>();
}
public Service getService(String serviceName){
for (Service service : services) {
	if(service.getName().equalsIgnoreCase(serviceName)){
		System.out.println("Returning Cached service "+serviceName+" object");
		return service;
	}
}return null;
}

public void addService(Service newSerice) {
	boolean exists=false;
	for (Service service : services) {
		if(service.getName().equalsIgnoreCase(newSerice.getName())){
			exists=true;
		}
	}
	if(!exists){
		services.add(newSerice);
	}
}



}
