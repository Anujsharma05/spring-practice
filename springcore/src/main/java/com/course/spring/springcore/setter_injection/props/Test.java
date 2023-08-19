package com.course.spring.springcore.setter_injection.props;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/course/spring/springcore/props/propconfig.xml");

		Languages lang = (Languages) context.getBean("languages");
		System.out.println(lang);
	}

}
