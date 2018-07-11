package com.exilant.day2;

public class WorkerInterfaceTest {

	public static void main(String[] args) {
		Runner runner=new Runner();
		runner.execute("vamsiii", "naveen", (s1,s2)->{
			if(s1.length()>s2.length()){
				System.out.println("s1 length "+s1.length());
			return s1.length();
			}else {
				System.out.println("s2 length "+s2.length());
				return s2.length();
			}
			
		});
//		System.out.println("-------------------------------------");
//		runner.execute(()->System.out.println("Hi, i'm in lambda way in main"));
//		
//		System.out.println("-------------------------------------");
//
//		runner.execute(()->{
//			System.out.println("Hi,I'm doimg in lambda in multiple lines");
//			System.out.println("you can have business logic here");
//		});
	}

}
