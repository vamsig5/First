package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Test2 {
	
	
	public static void main(String[] args) {
		String s="2432 4030 3397 4032 3952 2727 157 3284 3450 3229 4169 3471 4255 155 127 186\n" +"919 615 335 816 138 97 881 790 855 89 451 789 423 108 95 116";		
		String[] s1=s.split("\n");
		int sum=0;
		
		for (int i = 0; i < s1.length; i++) {
			String[] integerStrings = s1[i].split(" "); 
			int[] integers = new int[integerStrings.length]; 
			
			for (int j = 0; j < integers.length; j++){
			    integers[j] = Integer.parseInt(integerStrings[j]); 
			
			}
			Arrays.sort(integers);
			for (int j = 0; j < integers.length; j++) {
				System.out.println(integers[j]);
			}
			sum=sum+integers[0]+integers[integers.length-1];
			
			System.out.println("##############################");
		}
		System.out.println(sum);
   

	}
}
