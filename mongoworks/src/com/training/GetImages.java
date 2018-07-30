package com.training;

import java.io.IOException;
import java.util.List;

import com.mongodb.BasicDBList; 
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;

public class GetImages {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MongoClient client =new MongoClient("localhost", 27017);
		DB db=client.getDB("exdb");
		
		GridFS gfs=new GridFS(db, "myimage");
		String path="//Users//vamsi.c//Desktop//destimg//";
		List<GridFSDBFile> list=gfs.find(new BasicDBObject());
		for (GridFSDBFile gridFSDBFile : list) {
			gridFSDBFile.writeTo(path+gridFSDBFile.getFilename());
			
		}
		System.out.println("restored images in mongodb");
		client.close();
	}

}
