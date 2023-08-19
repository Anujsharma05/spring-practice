package com.course.spring.springcore.lifecycle.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	@PostConstruct
	public void initialize() {
		System.out.println("init method assignment");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("destroy method assignment");
	}
}
