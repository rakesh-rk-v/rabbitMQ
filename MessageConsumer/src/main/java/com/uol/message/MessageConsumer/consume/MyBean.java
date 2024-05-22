package com.uol.message.MessageConsumer.consume;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
	String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void testBean() {
		System.out.println("Bean is Created and Tested : "+message);
	}

}
