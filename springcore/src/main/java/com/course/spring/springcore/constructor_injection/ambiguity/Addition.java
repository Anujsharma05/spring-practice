package com.course.spring.springcore.constructor_injection.ambiguity;

public class Addition {

	/*
	 * public Addition(int a, int b) { System.out.println("int constructor"); }
	 * 
	 * public Addition(double a, double b) {
	 * System.out.println("double constructor"); }
	 * 
	 * public Addition(String a, String b) {
	 * System.out.println("String constructor"); }
	 */
	
	/**
	 * order variation ambiguity
	 */
	public Addition(int a, double b) {
		System.out.println(a);
		System.out.println(b);
	}
}
