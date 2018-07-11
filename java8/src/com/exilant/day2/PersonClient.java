package com.exilant.day2;

import java.util.Arrays;
import java.util.List;

public class PersonClient {

	public static void main(String[] args) {
		List<Person> persons=Arrays.asList(
				new Person(101,"vamsi"),
				new Person(102,"hanuma"),
				new Person(103,"uma"),
				new Person(104,"kavita"));
		persons.forEach(System.out :: println);
		PersonConsumer print=new PersonConsumer();
		persons.forEach(print);
		System.out.println("------------");
		//PrintConsumer pConsumer=new PrintConsumer();
	

	}
	

}
