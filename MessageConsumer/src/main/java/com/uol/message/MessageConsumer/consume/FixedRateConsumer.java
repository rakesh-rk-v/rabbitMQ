package com.uol.message.MessageConsumer.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
@Service
public class FixedRateConsumer {
	private static final Logger log = LoggerFactory.getLogger(FixedRateConsumer.class);
	
	@RabbitListener(queues = "SalesOrderQueue")
	public void fixedRateConsumers() {
		log.info("Consuming the Salaes Order Queue : {}");
	}

}
