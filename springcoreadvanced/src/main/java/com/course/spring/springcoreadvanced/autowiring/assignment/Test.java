package com.course.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcoreadvanced/autowiring/assignment/config.xml");
		Customer emp = (Customer) ctx.getBean("customer");
		System.out.println(emp);
	}

}
