package com.course.spring.springannotation.dao;

import org.springframework.stereotype.Component;

//@Component
public class Dao {

	public void create() {
		System.out.println("created");
	}
	
	public void initialize() {
		System.out.println("init works");
	}
	
	public void destruct() {
		System.out.println("dest works");
	}
}
