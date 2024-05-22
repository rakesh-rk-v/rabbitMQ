package com.uol.message.MessageConsumer.consume;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration
public class BeanMain {
	String message;
	@Bean
	public MyBean mybean() {
		System.out.println("Bean is calling ");
		return null;
		
	}

}
