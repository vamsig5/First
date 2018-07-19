package com.springt.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springt.aop.service.BankingService;

public class Client {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("log-context.xml");
	BankingService service=(BankingService)context.getBean("banking",BankingService.class);
//System.out.println(service.getSbAccount().getAcc());
//System.out.println(service.getCaAccount().getAccount());
	
	
//System.out.println(service.getCaAccount().showBalance());
System.out.println(service.getSbAccount().getAcc().getBalance());
//service.getSbAccount().getOnePara(100);
//String val=service.setAndGetString("vamsi");
//System.out.println("Return value in main "+val);
//service.throwSomeExcep();
	}

}
