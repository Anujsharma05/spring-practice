package com.course.spring.springcore.lifecycle.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcore/lifecycle/assignment/config.xml");
		
		TicketReservation reservation = (TicketReservation) ctx.getBean("ticketReservation");
		System.out.println(reservation);
		ctx.registerShutdownHook();
	}

}
