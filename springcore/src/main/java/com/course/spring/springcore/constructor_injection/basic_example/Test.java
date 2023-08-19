package com.course.spring.springcore.constructor_injection.basic_example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcore/constructor_injection/basic_example/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp);
	}

}
