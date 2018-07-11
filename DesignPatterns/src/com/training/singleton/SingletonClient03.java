package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



//program to access singleton(Eager) through reflection
public class SingletonClient03 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	
Singleton singletonI1=Singleton.getInstance();
Singleton singletonI2=null;
Singleton singletonI3=null;
Constructor[] constructor=Singleton.class.getDeclaredConstructors();
for (Constructor constructor2 : constructor) {
	//with this we can access private methods or constructors
	constructor2.setAccessible(true);
	singletonI2=(Singleton)constructor2.newInstance();
	singletonI3=(Singleton)constructor2.newInstance();
	break;
}
System.out.println("Instance one-hashCode"+singletonI1);
System.out.println("Instance two-hashCode"+singletonI2);
System.out.println("Instance three-hashCode"+singletonI3);
}
}