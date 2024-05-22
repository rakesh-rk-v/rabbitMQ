package com.uol.message.MessageConsumer.consume;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanClassExmp  {
	// private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); ;
	 
	 public static void main(String[] args) throws BeansException {
		// MyBean myBean = (MyBean) context.getBean("myBean");
		 ApplicationContext context =  new AnnotationConfigApplicationContext(FixedRateConsumer.class);
	      try {
			// FixedRateConsumer myBean = context.getBean(FixedRateConsumer.class);
			// myBean.fixedRateConsumers("Rakesh");
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        //myBean.fixedRateConsumers();
		
	        System.out.println("OutPut : ");
	       
	}
}
