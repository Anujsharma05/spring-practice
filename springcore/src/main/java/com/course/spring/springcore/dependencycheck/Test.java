package com.course.spring.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		System.out.println(prescription);
		
		/*
		 * Invoking pre shutdown hook
		 * Required to call the destroy method
		 */
		ctx.registerShutdownHook();
		
	}
}
