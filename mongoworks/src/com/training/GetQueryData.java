package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class GetQueryData {
public static void main(String[] args) {
		
		MongoClient client =new MongoClient("localhost", 27017);
		DB db=client.getDB("exdb");
		DBCollection dbc=db.getCollection("emps");
		
		DBObject queryCond=new BasicDBObject("empid", 103);
		DBObject sortCond=new BasicDBObject("empname", 1);
		
		Map<String, Integer> map=new HashMap<>();
		map.put("empid", 1);
		map.put("empname", 1);
		map.put("_id", 0);
		DBObject projection=new BasicDBObject(map);
        DBCursor cursor=dbc.find(queryCond,projection).sort(sortCond).limit(2);
        while (cursor.hasNext()) {
			DBObject dbObject = cursor.next();
			
			System.out.println(JSON.serialize(dbObject));
			System.out.println(dbObject.get("empid"));
		}



}
}
