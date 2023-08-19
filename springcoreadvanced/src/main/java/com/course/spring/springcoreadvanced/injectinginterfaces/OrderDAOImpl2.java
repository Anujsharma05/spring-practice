package com.course.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.stereotype.Component;

@Component("orderDao2")
public class OrderDAOImpl2 implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("inside order dao impl 2");
		
	}

}
