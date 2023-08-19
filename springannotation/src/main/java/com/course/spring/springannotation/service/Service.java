package com.course.spring.springannotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.course.spring.springannotation.dao.Dao;

//@Component
public class Service {

	@Autowired
	Dao dao;
	
	public void create() {
		dao.create();
	}
}
