package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> list=Arrays.asList(1,2,2,4,5,3,6,3,1);
	list.stream().filter(i -> Collections.frequency(list, i) >1)
	.collect(Collectors.toSet()).forEach(System.out::println);
	Map<Integer, Long> counts =
			list.stream().filter(i -> Collections.frequency(list, i) >1).collect(Collectors.groupingBy(e->e, (Collectors.counting())));
	System.out.println(counts);
//		Map<String, Integer> nameMap = new HashMap<>();
//		nameMap.put("John",1 );
//		Integer value = nameMap.computeIfAbsent("John", s -> s.length());
//		System.out.println(value);
//		Function<Integer, String> intToString = Object::toString;
//		Function<String, String> quote = s -> "'" + s + "'";
//		 
//		Function<Integer, String> quoteIntToString = quote.compose(intToString);
//		 
//		System.out.println(quoteIntToString.apply(5));
//		Map<String, Integer> salaries = new HashMap<>();
//		salaries.put("John", 40000);
//		salaries.put("Freddy", 30000);
//		salaries.put("Samuel", 50000);
//		 
//		salaries.replaceAll((name, oldValue) ->
//		  name.equals("Freddy") ? oldValue : oldValue + 10000);
//		System.out.println(salaries);
//	
//		int[] fibs = {0, 1};
//		Stream<Integer> fibonacci = Stream.generate(() -> {
//			int result = fibs[1];
//			int fib3 = fibs[0] + fibs[1];
//			fibs[0] = fibs[1];
//			fibs[1] = fib3;
//			return result;
//		}).limit(15);
//		List<Integer> list=fibonacci.collect(Collectors.toList());
//		System.out.println(list);
//		List<Integer> list1=Stream.generate(() -> {
//			int result = fibs[1];
//			int fib2 = fibs[0] + fibs[1];
//			fibs[0] = fibs[1];
//			fibs[1] = fib2;
//			return result;
//		}).limit(15).collect(Collectors.toList());
//		System.out.println(list1);
//		
		
		
		
		  String[][] data = new String[][]{{"vamsi", "ravi"}, {"jhon", "uma"}, {"munaf", "raj"}};

	        //Stream<String[]>
	        Stream<String[]> temp = Arrays.stream(data);

	        //Stream<String>, GOOD!
	        List<String> stringStream = temp.flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
	        System.out.println(stringStream);
	        

	        //Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

	        //stream.forEach(System.out::println);
		
	}

}
