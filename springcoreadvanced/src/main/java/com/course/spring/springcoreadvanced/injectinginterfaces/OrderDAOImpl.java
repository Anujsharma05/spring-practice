package com.course.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.stereotype.Component;

@Component("orderDao")
public class OrderDAOImpl implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("inside create order dao");
		
	}

}
