package com.course.spring.springannotation.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.course.spring.springannotation.SpringConfig;
import com.course.spring.springannotation.service.Service;

public class Test {

	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service service = (Service)ctx.getBean("sparta");
		service.create();
		ctx.close();
	}

}
