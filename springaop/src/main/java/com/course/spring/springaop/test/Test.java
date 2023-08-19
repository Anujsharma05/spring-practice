package com.course.spring.springaop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.course.spring.springaop.service.ProductService;

public class Test {
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springaop/test/config.xml");
		ProductService productService = (ProductService) ctx.getBean("productService");
		int ans = productService.multiply(4, 5);
		System.out.println(ans);
	}
}
