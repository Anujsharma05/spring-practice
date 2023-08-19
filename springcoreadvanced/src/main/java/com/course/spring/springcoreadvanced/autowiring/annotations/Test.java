package com.course.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcoreadvanced/autowiring/annotations/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp);
	}

}
