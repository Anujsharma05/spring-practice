package com.course.spring.springcore.setter_injection.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/course/spring/springcore/map/mapconfig.xml");
		
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
		
	}

}
