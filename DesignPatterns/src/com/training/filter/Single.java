package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Single implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> single=new ArrayList<Person>();
		   
		   for (Person person : persons) {
			if(person.getMartialstatus().equals("single")){
				single.add(person);
			}
		}
				return single;
	}

}
