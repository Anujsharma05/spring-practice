package com.course.spring.springaop.service;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		System.out.println("method code");
		return num1 * num2;
	}

}
