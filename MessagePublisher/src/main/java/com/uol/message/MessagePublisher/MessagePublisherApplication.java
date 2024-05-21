package com.uol.message.MessagePublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uol.message.MessagePublisher.producer.FixedRateProducer;
import com.uol.message.MessagePublisher.producer.HelloMessage;

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
		for(int i = 1;i<=10;i++)
		fixedRateProducer.sendMessages("SalesOrderQueue", Thread.currentThread().toString()+i);
		// helloMessage.sendMessage("Rakesh Kumar");
		
	}

}
