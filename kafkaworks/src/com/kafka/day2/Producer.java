package com.kafka.day2;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;

import org.apache.kafka.common.serialization.StringSerializer;

public class Producer extends Thread{

	private KafkaProducer<Integer, String> producer;
	private String topic;
	private boolean isAsync;
	private boolean interrupt;
	private String name;
	
	
	public Producer(String topic, boolean isAsync,String name) {
		this.topic = topic;
		this.isAsync = isAsync;
		this.name=name;
		interrupt=false;
	
	
	Properties properties=new Properties();
	
	//localhost:2181
	properties.setProperty("bootstrap.servers", KafkaProperties.KAFKA_SERVER_URL+":"+KafkaProperties.KAFKA_SERVER_PORT);
	properties.setProperty("client.id", KafkaProperties.PRODUCER_CLIENT_ID);
	properties.setProperty("key.serializer",IntegerSerializer.class.getName() );
	properties.setProperty("value.serializer", StringSerializer.class.getName());
	
	producer=new KafkaProducer<>(properties);

	}
	


	@Override
	public void run(){
		int messageNo=1;
		while (!interrupt) {
			String msgString="Message from producer "+this.name+" count: "+messageNo;
			if(isAsync){
				//send Async
				ProducerRecord<Integer, String> producerRecord=
						new ProducerRecord<Integer, String>(this.topic, messageNo, msgString);
				long startTime=System.currentTimeMillis();
				producer.send(producerRecord, new ProducerMessageCallable(startTime, messageNo, msgString));
			}else {
				try {
					ProducerRecord<Integer, String> producerRecord=
							new ProducerRecord<Integer, String>(this.topic, messageNo, msgString);
					producer.send(producerRecord).get();
				} catch (InterruptedException  | ExecutionException e) {
					e.printStackTrace();
				} 
			}
			
			messageNo++;
			
		}
		
	}
	public void setInterrupt( boolean interrupt){
		this.interrupt=interrupt;
	}
	
}
