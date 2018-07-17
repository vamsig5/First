package com.springt.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springt.basics.HelloService;

public class Client {
public static void main(String[] args) {
	//ApplicationContext context=new ClassPathXmlApplicationContext("spring-context2.xml");
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml","spring-context2.xml");
	Employee emp=context.getBean("emp", Employee.class);
	System.out.println("Emp Id:"+emp.getEmpId());
	System.out.println("Emp name:"+emp.getEmpName());
	System.out.println("emp sal:"+emp.getEmpSal());
	System.out.println("------------");
//	HelloService service=(HelloService)context.getBean("default");
//	System.out.println(service.sayHello());
//	System.out.println(emp.hashCode());
// emp=context.getBean("emp", Employee.class);
//	System.out.println("Emp Id:"+emp.getEmpId());
//	System.out.println("Emp name:"+emp.getEmpName());
//	System.out.println("emp sal:"+emp.getEmpSal());
//	System.out.println(emp.hashCode());
	context.registerShutdownHook();
}
}
