package com.course.spring.springcore.setter_injection.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/course/spring/springcore/assignment/assignmentconfig.xml");
		ShoppingCart cart = (ShoppingCart) ctx.getBean("cart");
		System.out.println(cart);
	}

}
