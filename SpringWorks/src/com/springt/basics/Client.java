package com.springt.basics;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {
		//XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring-context.xml");
		HelloService hello=(HelloService)factory.getBean("default",HelloService.class);
		System.out.println(hello.sayHello());
		System.out.println(hello.sayHello("sai", "mumbai"));
	}

}
