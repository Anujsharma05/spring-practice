package com.course.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcoreadvanced/injectinginterfaces/config.xml");
		OrderBO bo = (OrderBO) ctx.getBean("orderBo");
		bo.placeOrder();
	}

}
