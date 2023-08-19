package com.course.spring.boot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.course.spring.boot.springboot.dao.Dao;

@Component
public class Service {

	
	Dao dao;
	
	@Autowired
	public Service(@Qualifier("two") Dao dao) {
		this.dao = dao;
	}
	
	public void save() {
		dao.create();
	}
}
