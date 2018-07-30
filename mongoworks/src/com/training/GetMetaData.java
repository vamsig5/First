package com.training;

import java.util.Iterator;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class GetMetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MongoClient mongoClient=new MongoClient("localhost",27017);
System.out.println("connection got to "+mongoClient);
System.out.println("list of databases names from mongo");
for (String dbName : mongoClient.getDatabaseNames()) {
	System.out.println("\t"+dbName);
	DB db=mongoClient.getDB(dbName);
	for (String collectionNmae : db.getCollectionNames()) {
		System.out.println("\t"+collectionNmae);
		
	}
	
}
	}

}
