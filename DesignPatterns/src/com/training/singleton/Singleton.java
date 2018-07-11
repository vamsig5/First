package com.training.singleton;

import java.io.Serializable;

//the single says that there should be only one object
//to do so we will have the variable as static so that you can have the only one reference,in singleton we have two types
//1.eager singleton  2.lazy singleton
public class Singleton implements Serializable{

	private static final Singleton instance=new Singleton();
	
	private Singleton(){
	System.out.println("the constructor is called");
	}
	public static Singleton getInstance(){
		return instance;
	}
	//to stop creating an instance iof already exists
	protected Object readResolve() {
return getInstance();
	}
}
