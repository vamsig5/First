package com.exilant.day2;

import java.util.function.Consumer;

public class PersonConsumer implements Consumer<Person> {

	@Override
	public void accept(Person t) {
		System.out.println("person Id: "+t.getpId()+" person Name: "+t.getpName());		
	}
}

 class PrintConsumer{
	public static void print(Person p){
		System.out.println("static : "+p.getpId()+" "+p.getpName());
	}
	
}

