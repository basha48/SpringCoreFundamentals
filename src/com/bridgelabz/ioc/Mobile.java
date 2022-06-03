package com.bridgelabz.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ISim sim =	context.getBean("sim",ISim.class);
		sim.voiceCallService();
		sim.messageService();
		System.out.println("config loaded");
	}

}
