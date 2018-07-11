package com.exilant.day2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class RandomFilterEx {

	public static void main(String[] args) {
		// this will generate random numbers
		int randomNumber =ThreadLocalRandom.current().nextInt(100,200);
		System.out.println(randomNumber);
		System.out.println("----------------");
		///////////////////////
		Random random=new Random();
		random.ints(10, 100, 200).forEach(System.out::println);
		//we want in sorted order
		System.out.println("---------------------");
		random.ints(10, 100, 200).sorted().forEach(System.out::println);
/////////////////////////
		System.out.println("---------------------");
		System.out.println("--------using java 8------------");
		Stream.iterate(10, i->i+1).limit(20).sorted().forEach(System.out::println);
	}

}
