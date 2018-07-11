package com.exilant.day1;


//this program to show simple working of functional interface
//functional interface

@FunctionalInterface
interface MathOperation
{
	int operation(int num1,int num2);
}
public class Lamdab3 {

	public static int operate(int num1,int num2,MathOperation opr){
		return opr.operation(num1, num2);
	}
		
	public static void main(String[] args) {
  MathOperation add=(int num1,int num2) -> num1+num2;
  MathOperation sub=(int num1,int num2) -> num1-num2;

  System.out.println(operate(10, 20, add));
  System.out.println(operate(10, 20, sub));
  
//  MathOperation m1=new MathOperation() {
//	
//	@Override
//	public int operation(int num1, int num2) {
//		return 0;
//	}
//};
  MathOperation m1=(num1,num2)->num1+num2;
  System.out.println(m1.operation(12, 22));

	}

}
