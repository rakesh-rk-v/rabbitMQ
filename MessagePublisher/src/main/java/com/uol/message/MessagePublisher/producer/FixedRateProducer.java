package com.uol.message.MessagePublisher.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FixedRateProducer {
	private static Logger log = LoggerFactory.getLogger(FixedRateProducer.class);
	@Autowired
	RabbitTemplate rabbitTemplate;
	int i =0;
	@Scheduled(fixedRate = 500)
	public void sendMessages() {
		log.info("The Message is Send to : {} with a message : {}");
		rabbitTemplate.convertAndSend("SalesOrderQueue","Message Send : "+i);
		//log.error(message);
		rabbitTemplate.stop();
	}
	
}
