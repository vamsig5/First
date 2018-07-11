package com.exilant.day1;

public class LambdaThread0 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hi   from Ananymous call...start");	
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ananymous call exit");
			}
		}).start();
		
		////////////////////////lambda based///////////////
		new Thread(()->
		{
			
		System.out.println("Hi from lamda");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
   System.out.println("lambda call exit");
		}).start();
	}
}
