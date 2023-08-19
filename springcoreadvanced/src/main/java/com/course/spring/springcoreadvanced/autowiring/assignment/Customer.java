package com.course.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	private String name;
	private Reservation reservation;

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}

	@Autowired
	public Customer(String name, @Qualifier("reservation") Reservation reservation) {
		super();
		this.name = name;
		this.reservation = reservation;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Reservation getReservation() {
//		return reservation;
//	}
//
//	public void setReservation(Reservation reservation) {
//		this.reservation = reservation;
//	}
}
