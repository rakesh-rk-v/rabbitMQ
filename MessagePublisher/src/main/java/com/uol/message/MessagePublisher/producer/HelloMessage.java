package com.uol.message.MessagePublisher.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // To Know The Spring that Our  Class is Service.
public class HelloMessage {
	@Autowired //Auto wired is Because the Spring Will Create the Object Of That Class To Us . 
	private RabbitTemplate rabbitTemplate;
	
	// This MMethod is Declared to Know Send the Message
	public void sendMessage(String name) {
		rabbitTemplate.convertAndSend("SalesOrderQueue","Hello This Is My First Project imn Gradle My Name is  : "+ name);
	}
}
