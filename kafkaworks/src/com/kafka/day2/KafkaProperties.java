package com.kafka.day2;

public interface KafkaProperties {

	String TOPIC1="topicA";
	String TOPIC2="topicB";
	
	String KAFKA_SERVER_URL="localhost";
	int KAFKA_SERVER_PORT=9092;
	
	int KAFKA_PRODUCER_BUFFER_SIZE=100*1024;
	int CONNECTION_TIME_OUT=1000*10*10;
	
	String CLIENT_ID="SimpleConsumerDemoClient";
	
	String PRODUCER_CLIENT_ID="DemoProducer";
	
	
	
}
