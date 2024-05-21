package com.uol.message.MessagePublisher.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FixedRateProducer {
	
	@Autowired
	RabbitTemplate rabbitTemplate = new RabbitTemplate();
	public void sendMessages(String queueName,String message) {
		rabbitTemplate.convertAndSend(queueName,"Message Send : "+message);
	}
}
