package com.course.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderBo")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("orderDao2")
	private OrderDAO dao;
	
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void placeOrder() {
		System.out.println("inside place order bo");
		dao.createOrder();
	}
}
