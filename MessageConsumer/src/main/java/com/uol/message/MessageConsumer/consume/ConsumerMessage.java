package com.uol.message.MessageConsumer.consume;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerMessage {

	@RabbitListener(queues= "SalesOrderQueue")
	public void consumeMessage(String name) {
		System.out.println(" Consuming the Name : "+name);
	}
}
