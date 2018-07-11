package com.exilant.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FileStreamEx {

	public static void main(String[] args) throws IOException {
	//Files.list(Paths.get(".")).map(Path::getFileName).forEach(System.out::println);
	
//	List<String> list=Stream.of("one","two","three","four").map(String::toUpperCase).collect(Collectors.toList());
//	list.forEach(System.out::println);
	
	
	Files.list(Paths.get("."))
	     .map(Path::getFileName)
	     .map(Path::toString).map(String::toUpperCase)
	     .filter(name->name.endsWith("TXT"))
//	     .sorted().limit(5)
	     .forEach(name->doSome(name));
	
	
	
	
	
	
	
	
	}
	//given the file name,show the content of the same
	//and only show those lines which has Exilant(either in upper or lower)
	public static void doSome(String fileName){
		System.out.println("your action goes here for "+fileName);
	}

}
