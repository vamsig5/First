package com.springt.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
//ApplicationContext context=new AnnotationConfigApplicationContext();
//((AnnotationConfigApplicationContext)context).getEnvironment().setActiveProfiles("Production");
////scans the mentioned packages and  register all the component available in the spring
//((AnnotationConfigApplicationContext)context).scan("com.springt.profile");
//((AnnotationConfigApplicationContext)context).refresh();
//((AnnotationConfigApplicationContext)context).close();
		AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext();
		config.getEnvironment().setActiveProfiles("Development","Production");
		config.scan("com.springt.profile");
		config.refresh();
		config.close();
	}

}
