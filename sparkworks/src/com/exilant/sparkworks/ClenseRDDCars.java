package com.exilant.sparkworks;

import java.util.Arrays;

import org.apache.spark.api.java.function.Function;

public class ClenseRDDCars implements Function<String, String> {

	@Override
	public String call(String v1) throws Exception {
		String[] attributelist=v1.split(",");
		//change character to number
	
		attributelist[3] =(attributelist[3].equals("two")?"2":"4");
		attributelist[4]=attributelist[4].toUpperCase();
		return Arrays.toString(attributelist);
	}

}
