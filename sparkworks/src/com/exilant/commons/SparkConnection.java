package com.exilant.commons;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

public class SparkConnection {

	
	private static String appName="sampleApp" ;
	private static String sparkMaster="local[2]";
	private static JavaSparkContext sparkContext=null;
	private static SparkSession sparkSession=null;
	private static String tempDir="/Users/vamsi.c/Desktop/sparkwarehouse";
	private static void getConnection(){
		if(sparkContext==null){
			SparkConf conf=new SparkConf().setAppName(appName).setMaster(sparkMaster);
			sparkContext=new JavaSparkContext(conf);
			sparkSession=SparkSession.builder().appName(appName).master(sparkMaster).config("spark.sql.warehouse.dir", tempDir).getOrCreate();
			
		}
	}
	public static JavaSparkContext getContext(){
		if (sparkContext==null) {
			getConnection();
			
		}
		return sparkContext;
		
	}
	
	public static SparkSession getSession(){
	if (sparkSession==null) {
		getConnection();
		
	}
	return sparkSession;
	}
	
}
