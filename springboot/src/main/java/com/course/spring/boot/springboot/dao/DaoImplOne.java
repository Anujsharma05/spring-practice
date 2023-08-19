package com.course.spring.boot.springboot.dao;

import org.springframework.stereotype.Component;

@Component("one")
public class DaoImplOne implements Dao {

	@Override
	public void create() {
		System.out.println("created");
	}
}
