package com.course.spring.springcoreadvanced.stereotypeannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcoreadvanced/stereotypeannotations/config.xml");
		Instructor instructor1 = (Instructor) ctx.getBean("inst");
		Instructor instructor2 = (Instructor) ctx.getBean("inst");
		System.out.println(instructor1);
		System.out.println(instructor2);
	}

}
