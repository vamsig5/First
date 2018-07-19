package com.springt.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("message-resource.xml");
		String engGoodMrng = context.getMessage("goodmorning", new Object[] {}, new Locale("EN"));
		
		//System.out.println(engGoodMrng);
		
		
	String frGoodMrng = context.getMessage("goodmorning", new Object[] {}, new Locale("FR"));
	System.out.println(engGoodMrng);	
	System.out.println(frGoodMrng);
	System.out.println("--------------------------");
		HelloWorld helloWorld = context.getBean("helloworld", HelloWorld.class);
	helloWorld.sayHello();
	}
}
