package com.course.rabbitmq.producer.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.rabbitmq.producer.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SpringEmployeeJsonProducer {
	Logger log = LoggerFactory.getLogger(SpringEmployeeJsonProducer.class);
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private ObjectMapper objectMapper;

	public void sendMessage(Employee emp) throws JsonProcessingException {
		var json = objectMapper.writeValueAsString(emp);
		log.info("Employee  Details Sending "+ emp);
		rabbitTemplate.convertAndSend("x.spring2.work", "", json);
		log.info("Finished Sending " );
	}

}
