package com.course.spring.springcore.lifecycle.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcore/lifecycle/xmlconfig/config.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		System.out.println(patient);
		
		/*
		 * Invoking pre shutdown hook
		 * Required to call the destroy method
		 */
		ctx.registerShutdownHook();
	}
}
