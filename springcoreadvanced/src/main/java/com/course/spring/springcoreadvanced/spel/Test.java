package com.course.spring.springcoreadvanced.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcoreadvanced/spel/config.xml");
		Instructor instructor1 = (Instructor) ctx.getBean("inst");
		System.out.println(instructor1);
	}

}
