package com.course.spring.springcore.setter_injection.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/course/spring/springcore/reference/refconfig.xml");
		
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
