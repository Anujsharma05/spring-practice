package com.course.spring.springcore.setter_injection.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/course/spring/springcore/list/listconfig.xml");
		
		Hospital h = (Hospital) context.getBean("hospital");
		System.out.println(h.getName());
		System.out.println(h.getDepartments().getClass()); //arraylist by default
		for(String dept: h.getDepartments()) {
			System.out.println(dept);
		}
	}
}
