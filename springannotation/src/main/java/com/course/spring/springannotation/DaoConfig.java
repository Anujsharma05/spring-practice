package com.course.spring.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.course.spring.springannotation.dao.Dao;

@Configuration
public class DaoConfig {
	
	@Bean(initMethod = "initialize", destroyMethod = "destruct")
	public Dao dao() {
		return new Dao();
	}
}
