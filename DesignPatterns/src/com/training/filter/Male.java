package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Male implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
   List<Person> male=new ArrayList<Person>();
   
   for (Person person : persons) {
	if(person.getSex().equals("male")){
		male.add(person);
	}
}
		return male;
	}

}
