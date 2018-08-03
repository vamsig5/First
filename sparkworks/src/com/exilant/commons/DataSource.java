package com.exilant.commons;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class DataSource {

	public static JavaRDD<Integer> getCollData(){
		JavaSparkContext sparkContext=SparkConnection.getContext();
		List<Integer> data=Arrays.asList(3,44,23,56,33,67,58,87,33,44);
		JavaRDD<Integer> collData=sparkContext.parallelize(data);
		collData.cache();
		return collData;
	}
	
}
