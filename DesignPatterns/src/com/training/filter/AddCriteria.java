package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class AddCriteria implements ICriteria {
	private ICriteria firstCriteria;
	private ICriteria secondCriteria;

	
	public AddCriteria(ICriteria firstCriteria, ICriteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// first filteration for criteria happens here
		List<Person> andList=firstCriteria.meetCriteria(persons);
		//from extracted we shall have another criteria
		return secondCriteria.meetCriteria(andList);

	}

}
