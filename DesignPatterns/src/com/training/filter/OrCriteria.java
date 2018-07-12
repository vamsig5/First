package com.training.filter;

import java.util.List;

public class OrCriteria implements ICriteria {
private ICriteria first;
private ICriteria second;


	public OrCriteria(ICriteria first, ICriteria second) {
	super();
	this.first = first;
	this.second = second;
}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
				List<Person> list1=first.meetCriteria(persons);
		List<Person> list2=second.meetCriteria(persons);
		
//	Set<Person> set3=new HashSet<Person>();
//	set3.addAll(list1);
//	set3.addAll(list2);
//	return set3;
		
		for (Person person : list2) {
			if(!list1.contains(person)){
				list1.add(person);
			}
		}
		
		
		return list1;
	}

}
