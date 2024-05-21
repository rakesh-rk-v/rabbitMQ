package com.uol.message.MessagePublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.uol.message.MessagePublisher.producer.FixedRateProducer;
import com.uol.message.MessagePublisher.producer.HelloMessage;
@EnableScheduling
@SpringBootApplication
public class MessagePublisherApplication  implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(MessagePublisherApplication.class, args);
	}
	
	@Autowired
	HelloMessage helloMessage;
	
	@Autowired 
	FixedRateProducer fixedRateProducer = new FixedRateProducer();

	@Override
	public void run(String... args) throws Exception {
		
		fixedRateProducer.sendMessages();
		for(int i =1;i<=200000;i++) {
		 helloMessage.sendMessage("Rakesh Kumar");
		}
		
	}
	
	

}
