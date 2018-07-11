package com.exilant.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		writeTofile();
		readFromFile();
	}
	public static void writeTofile() {
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter("sample.txt"));
			bw.write("Hello");
			bw.newLine();
			bw.write("How r u");
			bw.newLine();
			bw.write("its good");
		} catch (IOException ie) {
			ie.printStackTrace();
		}finally {try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}
	}
//	public static void writeToFile() throws IOException{
//		try(BufferedWriter bw=new BufferedWriter(new FileWriter("sample.txt"))){
//			bw.write("Hello");
//			bw.newLine();
//			bw.write("How r u");
//			bw.newLine();
//			bw.write("its good");
//		}
//	}
	public static void readFromFile() throws IOException{
		try(BufferedReader br=new BufferedReader(new FileReader("sample.txt"))){
			br.lines().forEach(System.out::println);
		}
	}

}
