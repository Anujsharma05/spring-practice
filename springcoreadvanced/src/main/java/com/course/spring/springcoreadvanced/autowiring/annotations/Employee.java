package com.course.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

//	@Autowired(required=false)
//	@Qualifier("abcde")
	private Address address;

	@Autowired
	public Employee(@Qualifier("abcd") Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
//	@Qualifier("abcd") 
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
