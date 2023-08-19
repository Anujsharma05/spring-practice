package com.course.spring.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("called before the init method");
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Patient id: " + id;
	}
	
	public void hi() {
		System.out.println("Init method");
	}
	
	public void bye() {
		System.out.println("Destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init Method through interfaces");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Method through interfaces");
	}

}
