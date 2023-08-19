package com.course.spring.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springcore/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) ctx.getBean("dao");
		System.out.println(dao);
	}

}
