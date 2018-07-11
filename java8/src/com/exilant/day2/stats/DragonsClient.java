package com.exilant.day2.stats;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {
	public static void main(String[] args) {
		List<Dragons> dragons=Stream.of(
				new Dragons("Errol","USA",15),
				new Dragons("Errol","USA",33),
				new Dragons("Firnan","USA",5),
				new Dragons("Hasai","France",12),
				new Dragons("IceFire","France",13)	
				).collect(Collectors.toList());
		//to find number of dragons
		Map<String,Long> mapdrag=dragons.stream().collect(Collectors.groupingBy(Dragons::getName,Collectors.counting()));
		System.out.println(mapdrag);
		Map<String,Integer> sumdrag=dragons.stream()
				.collect(Collectors.groupingBy(Dragons::getName,
						Collectors.summingInt(Dragons::getCount)));
		sumdrag.forEach((k,v)->{
			System.out.println("Dragon Name"+ k+", "+"Number of Dragons"+v);
		});
		
		//find dragon by country and keep the name of dragon of different countries in list/set
		Map<String,List<Dragons>> mapbycountry=dragons.stream()
				.collect(Collectors.groupingBy(Dragons::getCountry,Collectors.toList()));
		System.out.println(mapbycountry);
		
		
		Map<String,Double> avgnum=dragons.stream()
				.collect(Collectors.groupingBy(Dragons::getName,
						Collectors.averagingDouble(Dragons::getCount)));
		sumdrag.forEach((k,v)->{
			System.out.println("Dragon Name"+ k+", "+"Average Number of Dragons"+v);
		});
		
	}

}
