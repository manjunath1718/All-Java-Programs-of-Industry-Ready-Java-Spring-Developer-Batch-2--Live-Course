package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.telusko.util.AppConstants;

@SpringBootApplication
public class AppKafkaPubsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppKafkaPubsApplication.class, args);
	}
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = "group_customer")
	public void subscribeMsgFromKafkaTopic(String cxData) {
		
		System.out.println("Message is comming from kafka server");
		System.out.println(cxData);
	}

}
