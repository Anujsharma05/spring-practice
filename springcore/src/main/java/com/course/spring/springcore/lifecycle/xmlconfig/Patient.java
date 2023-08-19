package com.course.spring.springcore.lifecycle.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Called before the init method");
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Patient id: " + id;
	}
	
	public void hi() {
		System.out.println("Init method");
	}
	
	public void bye() {
		System.out.println("Destroy method");
	}
}
