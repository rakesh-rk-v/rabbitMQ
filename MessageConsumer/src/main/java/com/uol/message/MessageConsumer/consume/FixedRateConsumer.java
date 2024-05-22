package com.uol.message.MessageConsumer.consume;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;




@Service
public class FixedRateConsumer {
	
	public FixedRateConsumer(String name) {
		System.out.println("Private Constructor...........");
	}
	private static final Logger log = LoggerFactory.getLogger(FixedRateConsumer.class);
	 
	@RabbitListener(queues = "SalesOrderQueue" , concurrency = "1-5")
	public String fixedRateConsumers() {
		
		log.info("Consuming the Salaes Order Queue : {}..........");
		return "HHHHH";
	}
	

}
