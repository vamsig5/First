package com.kafka.day2;

public class Client {

	public static void main(String[] args) {

		Boolean isAsync=true;
		
		Producer producer=new Producer(KafkaProperties.TOPIC2, isAsync, "Hello");
		producer.start();
		System.out.println("producer started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
           e.printStackTrace();		
         }
	 producer.setInterrupt(true);	
	}
	

}
