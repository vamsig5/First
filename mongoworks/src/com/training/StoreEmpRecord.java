package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class StoreEmpRecord {
public static void main(String[] args) {
		
		MongoClient client =new MongoClient("localhost", 27017);
		DB db=client.getDB("exdb");
		DBCollection dbc=db.getCollection("emps");
	DBObject object=new BasicDBObject();
//		object.put("empid", 201);
//		object.put("empname", "kavita");
//		object.put("empemail", "kavta@gmail.com");
//		object.put("empsal", 12121);
//		dbc.save(object);
//		System.out.println("Object Saved..");
//		Map<String, Object> map=new HashMap<String, Object>();
//		//2nd
//		map.put("empid", 202);
//		map.put("empname", "rani");
//		map.put("empemail", "rani@gmail.com");
//		map.put("empsal", 22151);
//		dbc.save(new BasicDBObject(map));
//		System.out.println("Object Saved..");
//
//		
//		
//		//3rd
//		String json="{empid:302,empname:'ramesh',empemail:'ram@gmail.com',empsal:42111}";
//		dbc.save((DBObject) JSON.parse(json));
//		System.out.println("Object Saved..");

		//4th
		Employee employee=new Employee();
		employee.setEmpid(304);
		employee.setEmpname("Anju");
		employee.setEmpemail("anju@mmail.com");
		employee.setEmpsal(52525);
		dbc.save(employee);
		System.out.println("Objecty created");
		
}
}
