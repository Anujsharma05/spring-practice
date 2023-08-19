package com.course.spring.springcore.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcore/beanscope/config.xml");
		University uni1 = (University) ctx.getBean("university");
		University uni2 = (University) ctx.getBean("university");
		
		/**
		 * By default singleton scope for bean, always gets the same object
		 * In prototype scope, always gets a new object
		 */
		System.out.println(uni1.hashCode());
		System.out.println(uni2.hashCode());
	}

}
