package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

public class StoreImg {

	public static void main(String[] args) throws FileNotFoundException {
		MongoClient client =new MongoClient("localhost", 27017);
		DB db=client.getDB("exdb");
		
		GridFS gfs=new GridFS(db, "myimage");
		String path="//Users//vamsi.c//Desktop//srcimg//";
		
	File folderpath=new File(path);
	for (File file : folderpath.listFiles()) {
		InputStream inputStream=new FileInputStream(file);
		GridFSInputFile picture=gfs.createFile(inputStream, file.getName());
		picture.setMetaData(new BasicDBObject("description", "image "+file.getName()+" store in exilant"));
		picture.save();
	}
	client.close();

	System.out.println("picture saved in DB");
	}

}
