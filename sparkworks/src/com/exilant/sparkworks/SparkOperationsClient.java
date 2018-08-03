package com.exilant.sparkworks;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.DoubleFunction;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.ReduceFunction;
import org.apache.spark.util.StatCounter;
import org.netlib.util.doubleW;

import com.exilant.commons.DataSource;
import com.exilant.commons.SparkConnection;
import com.exilant.commons.Utilities;

import scala.collection.generic.BitOperations.Int;

public class SparkOperationsClient {

	public static void main(String[] args) {
		Logger.getLogger("org").setLevel(Level.ERROR);
		// Logger.getLogger("akka").setLevel(Level.ERROR);
		JavaSparkContext sparkContext = SparkConnection.getContext();
		// start loading the data
		// 1.load the collection and cache it
		JavaRDD<Integer> collData = DataSource.getCollData();
		System.out.println("total no of records: " + collData.count());

		JavaRDD<Integer> dist = collData.distinct();
		Utilities.printIntegerRDD(dist, 10);

		// 2.load the file and cache it
		JavaRDD<String> autoDataContent = sparkContext.textFile("./data/auto-data.csv");
		System.out.println("number of records :" + autoDataContent.count());
		autoDataContent.take(5).forEach(System.out::println);
		System.out.println("Loading data from File");

		Utilities.printStringRDD(autoDataContent, 10);

		// storing RDD'S

		// autoDataContent.saveAsTextFile("data/auto-data-modified.csv");

		JavaRDD<String> tsvData = autoDataContent.map(str -> str.replace(",", "\t"));

		// autoDataContent.saveAsTextFile("data/auto-data-modified2.csv");
		Utilities.printStringRDD(tsvData, 10);

		////// Filter//
		// to remove header
		String header = autoDataContent.first();
		JavaRDD<String> autoDataWoutHeader = autoDataContent.filter(s -> !s.equals(header));

		Utilities.printStringRDD(autoDataWoutHeader, 5);
		/// filter ..has only toyota

		JavaRDD<String> toyotaData = autoDataContent.filter(s -> s.contains("toyota"));
		System.out.println("---only toyota vehicles-----");
		Utilities.printStringRDD(toyotaData, 10);

		JavaRDD<String> distString = autoDataContent.distinct();
		Utilities.printStringRDD(distString, 10);

		// to count no of words in the given Rdd
		System.out.println("Using flat map:");
		JavaRDD<String> words = toyotaData.flatMap(new FlatMapFunction<String, String>() {

			
			private static final long serialVersionUID = 1L;

			@Override
			public Iterator<String> call(String t) throws Exception {
				return Arrays.asList(t.split(",")).iterator();

			}
		});
		System.out.println("Toyata Rdd word count: " + words.count());

		// cleansing the data

		System.out.println("----------After Cleansing__________");
		JavaRDD<String> cleansRdd = autoDataContent.map(new ClenseRDDCars());
		Utilities.printStringRDD(cleansRdd, 10);

		// set operation
		JavaRDD<String> word1 = sparkContext.parallelize(Arrays.asList("a", "b","hello"));
		JavaRDD<String> word2 = sparkContext.parallelize(Arrays.asList("hello", "how", "were", "yesterday"));
		
		System.out.println("Union operation - Set");

		JavaRDD<String> temp = word1.union(word2); 
		
		Utilities.printStringRDD(temp, 6);
		

		
		
		System.out.println("Intersection operation - Set");
		Utilities.printStringRDD(word1.intersection(word2), 10);

		
		//find sum of numbers in given Rdd
		
	Integer autoDataCount=collData.reduce((x,y)->x+y);
	System.out.println("sum of given integers "+autoDataCount);
	
StatCounter stats=autoDataWoutHeader.mapToDouble(new MPGWork()).stats();
double avg=stats.sum()/stats.count();
System.out.println("avg mpc"+avg);


String totMPG=autoDataWoutHeader.reduce(new MPGWork1());

	}

}
