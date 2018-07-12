package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Married implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> married=new ArrayList<Person>();
		   
		   for (Person person : persons) {
			if(person.getMartialstatus().equals("married")){
				married.add(person);
			}
		}
				return married;
	}

}
