package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Female implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
  List<Person> female=new ArrayList<Person>();
  for (Person person : persons) {
	if(person.getSex().equals("female")){
		female.add(person);
	}
}
		
		
		return female;
	}

}
