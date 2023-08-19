package com.course.spring.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("called before the init method");
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Patient id: " + id;
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Init method through annotations");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Destroy method through annotations");
	}
}
