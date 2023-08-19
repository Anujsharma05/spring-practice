package com.course.spring.springcore.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcore/innerbeans/config.xml");
		Employee emp1 = (Employee) ctx.getBean("employee");
		Employee emp2 = (Employee) ctx.getBean("employee");
		
		System.out.println(emp1.hashCode() == emp2.hashCode());
	}

}
