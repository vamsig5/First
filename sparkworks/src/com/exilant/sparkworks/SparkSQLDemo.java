package com.exilant.sparkworks;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataType;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import static org.apache.spark.sql.functions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.exilant.commons.DataSource;
import com.exilant.commons.SparkConnection;

public class SparkSQLDemo {

	public static void main(String[] args) {
		Logger.getLogger("org").setLevel(Level.ERROR);
		//Logger.getLogger("akka").setLevel(Level.ERROR);

		JavaSparkContext sparkContext = SparkConnection.getContext();
		SparkSession sparkSession=SparkConnection.getSession();
//  Dataset<Row> empDFields=sparkSession.read().json("./data/CustomerData.json");
//  empDFields.show();
//  empDFields.printSchema();
//  
//  System.out.println("SELECT Demo");
//  empDFields.select(col("name"),col("salary")).show();
//  
//  System.out.println("select Demo with condition");
//  empDFields.filter(col("gender").equalTo("male")).show();
//  
//  System.out.println("Aggregate groupy by gender");
//  empDFields.groupBy(col("gender")).count().show();
//  
//  System.out.println("group by deptid,avg sal ,max age");
//  
//  Dataset<Row> summaryData=empDFields.groupBy(col("deptid")).agg(avg(empDFields.col("salary")),max(empDFields.col("age")));
//  summaryData.show();
//  //--------try with bean-----------
//  
//  Department dept1=new Department(100,"Development");
//  Department dept2=new Department(200, "Testing");
//  List<Department> deptList=new ArrayList<Department>();
//  deptList.add(dept1);
//  deptList.add(dept2);
//  Dataset<Row> deptDFields=sparkSession.createDataFrame(deptList, Department.class);
//  System.out.println("Department contents are :");
//  deptDFields.show();
//  System.out.println("join Employee with Department");
// Dataset<Row> empDeptJoin= empDFields.join(deptDFields, col("deptid").equalTo(col("departId")));
// empDeptJoin.show();
// 
// System.out.println("join with aggregation and groupby");
//  empDFields.filter(col("age").gt(30)).join(deptDFields, col("deptid").equalTo(col("departId"))).groupBy(col("deptid")).agg(avg(empDFields.col("salary")),max(empDFields.col("age"))).show();
  
  
  
  Dataset<Row> autoData=sparkSession.read().option("header", true).csv("./data/auto-data.csv");
  autoData.show(5);
	
	//creating RDD with row object
  Row row1=RowFactory.create(1,"India","Benguluru");
  Row row2=RowFactory.create(2,"USA","Reston");
  Row row3=RowFactory.create(3,"UK","Steevenscreek");
  List<Row> rlist=new ArrayList<Row>();
  rlist.add(row1);
  rlist.add(row2);
  rlist.add(row3);
  JavaRDD<Row> rowRDD=sparkContext.parallelize(rlist);
  StructType schema=DataTypes.createStructType(new StructField[] {
		  							DataTypes.createStructField("id",DataTypes.IntegerType, false),
		  							DataTypes.createStructField("country",DataTypes.StringType, false),
		  							DataTypes.createStructField("city",DataTypes.StringType, false)
                            		}
		                              );
   
	Dataset<Row> tempDataFields=sparkSession.createDataFrame(rowRDD, schema);
	tempDataFields.show();
	
	//working with csv data,with sql statements
	//provide dat is present in table like format
	//this persistance will be only end of program
	//means temporary
	autoData.createOrReplaceTempView("autos");
	System.out.println("Temp Table Contents:");
	System.out.println("showing all data  hp greater than 200 ");
	sparkSession.sql("select * from autos where HP >200").show();
	
	//to find make,maximum RPM from autos group by make
	
	sparkSession.sql("select make,max(rpm) from autos group by make order by 1").show();
	
	//convert Dataset to RDD
	JavaRDD<Row> autoRDD=autoData.rdd().toJavaRDD();
	//reading the data from mysql DB
	Map<String, String> jdbcConnectParams=new HashMap<>();
	jdbcConnectParams.put("url", "jdbc:mysql://localhost:3306/system");
	jdbcConnectParams.put("driver", "com.mysql.jdbc.Driver");
	jdbcConnectParams.put("dbtable", "Customer");
	jdbcConnectParams.put("user","root");
	jdbcConnectParams.put("password", "vamsi");
	System.out.println("create a data from DB Table");
	Dataset<Row> sqlDataField=sparkSession.read().format("jdbc").options(jdbcConnectParams).load();
	sqlDataField.show();
	
	//JavaSparkContext jsc=new JavaSparkContext(sparkSession.sparkContext());
	
	
	}

}





















