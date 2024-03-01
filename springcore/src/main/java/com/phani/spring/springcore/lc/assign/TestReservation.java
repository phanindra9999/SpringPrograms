package com.phani.spring.springcore.lc.assign;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReservation {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/phani/spring/springcore/lc/assign/config.xml");
		TicketReservation ticketreservation = (TicketReservation) context.getBean("ticketreservation");
		System.out.println(ticketreservation);
		context.registerShutdownHook();

	}

}
