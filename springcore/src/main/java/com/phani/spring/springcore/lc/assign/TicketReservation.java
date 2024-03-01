package com.phani.spring.springcore.lc.assign;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	
	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize method");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanup method");
	}
}
