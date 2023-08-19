package com.course.spring.springcore.constructor_injection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcore/constructor_injection/ambiguity/config.xml");
		ctx.getBean("add");
	}

}
