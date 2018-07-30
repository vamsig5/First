package com.training;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetOneRecord {

	public static void main(String[] args) {
		
		MongoClient client =new MongoClient("localhost", 27017);
		DB db=client.getDB("exdb");
		DBCollection dbc=db.getCollection("emps");
		DBObject myobj=dbc.findOne();
		System.out.println("Employee id "+myobj.get("empid"));
		System.out.println("Employee name "+myobj.get("empname"));
		System.out.println("Employee sal "+myobj.get("empsal"));
		
	}
}
