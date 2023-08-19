package com.course.spring.springcoreadvanced.standalonecollections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcoreadvanced/standalonecollections/config.xml");
		ProductsList list = (ProductsList) ctx.getBean("prods");
		System.out.println(list);
	}

}
