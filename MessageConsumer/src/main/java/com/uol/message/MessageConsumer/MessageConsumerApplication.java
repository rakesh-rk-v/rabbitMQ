package com.uol.message.MessageConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uol.message.MessageConsumer.consume.ConsumerMessage;
import com.uol.message.MessageConsumer.consume.FixedRateConsumer;

@SpringBootApplication
public class MessageConsumerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MessageConsumerApplication.class, args);
	}
	@Autowired
	ConsumerMessage consumerMessage;

	@Autowired
	FixedRateConsumer fixedRateConsumer;
	@Override
	public void run(String... args) throws Exception {
		// consumerMessage.consumeMessage("consumerMessage");
		fixedRateConsumer.fixedRateConsumers();
		
	}

}
