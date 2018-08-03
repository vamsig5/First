package com.exilant.sparkworks;

import org.apache.spark.api.java.function.DoubleFunction;
import org.apache.spark.api.java.function.Function;


public class MPGWork implements  DoubleFunction<String>{
 Double totalMPGCity;
 Double totalMPGHw;
	@Override
	public double call(String v1) throws Exception { 
		String[] attributelist=v1.split(",");
totalMPGCity=Double.parseDouble(attributelist[10]);
totalMPGHw=Double.parseDouble(attributelist[11]);
return totalMPGCity;
	}
public double getAvgMPC(int count) {
	return totalMPGCity/count;
}
public double getAvgMPH(int count) {
	return totalMPGHw/count;
}
}
