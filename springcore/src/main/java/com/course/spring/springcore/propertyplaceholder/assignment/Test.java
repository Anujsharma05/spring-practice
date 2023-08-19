package com.course.spring.springcore.propertyplaceholder.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcore/propertyplaceholder/assignment/config.xml");
		WSClient client = (WSClient) ctx.getBean("client");
		System.out.println(client);
	}

}
