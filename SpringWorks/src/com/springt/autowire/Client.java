package com.springt.autowire;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springt.helloi18n.AppConfig;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MobConfig.class);
		Mobile mobile=context.getBean("mobile", Mobile.class);
		System.out.println("Mobile Details:");
		System.out.println("Camera Details: "+mobile.getCamera().getType());
//		System.out.println("speaker Details: "+mobile.getSpeaker().getType()+" "+mobile.getSpeaker().getVolLevels());
//		System.out.println("screen Details: "+mobile.getScreen().getLen()+" "+mobile.getScreen().getBre()+" "+mobile.getScreen().getGlassType());
//		
//	
	}

}
