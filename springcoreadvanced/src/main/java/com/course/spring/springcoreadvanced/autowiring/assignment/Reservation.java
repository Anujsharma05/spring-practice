package com.course.spring.springcoreadvanced.autowiring.assignment;

public class Reservation {

	private int id;
	private String time;

	public Reservation(int id, String time) {
		this.id = id;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}

}
