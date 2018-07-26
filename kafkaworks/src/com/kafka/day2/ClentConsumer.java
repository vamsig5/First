package com.kafka.day2;

public class ClentConsumer {
public static void main(String[] args) {
	Consumer consumer=new Consumer(KafkaProperties.TOPIC2, false);
	consumer.start();
}
}
