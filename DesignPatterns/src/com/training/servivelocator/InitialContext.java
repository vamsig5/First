package com.training.servivelocator;

public class InitialContext {
	public Object lookup(String jndiName){
		if(jndiName.equalsIgnoreCase("db")){
			System.out.println("looking for db service and creating");
			return new DBService();
		}else if(jndiName.equalsIgnoreCase("erp")){
			System.out.println("looking for Erp service and creating");
			return new ERPService();
		}
		return null;
	}

}
