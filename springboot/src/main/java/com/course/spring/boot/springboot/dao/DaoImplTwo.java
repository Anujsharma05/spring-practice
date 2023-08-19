package com.course.spring.boot.springboot.dao;

import org.springframework.stereotype.Component;

@Component("two")
public class DaoImplTwo implements Dao {

	@Override
	public void create() {
		System.out.println("created from impl two");
		
	}

}
