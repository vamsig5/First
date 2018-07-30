package com.training;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetAllRecords {
public static void main(String[] args) {
		
		MongoClient client =new MongoClient("localhost", 27017);
		DB db=client.getDB("exdb");
		DBCollection dbc=db.getCollection("emps");
		DBCursor cursor=dbc.find();
		while (cursor.hasNext()) {
			DBObject dbObject = cursor.next();
			
			System.out.println("Employee id "+dbObject.get("empid"));
			System.out.println("Employee name "+dbObject.get("empname"));
			System.out.println("Employee sal "+dbObject.get("empsal"));
			System.out.println("-------------------------------");
		}
		
		
		
		
}
}
