package com.practice.componentmapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.componentmapping.entity.Address;
import com.practice.componentmapping.entity.Employee;
import com.practice.componentmapping.repository.EmployeeRepository;

@SpringBootTest
class ComponentmappingApplicationTests {

	@Autowired
	private EmployeeRepository repository;

	@Test
	void contextLoads() {
		Address addr = new Address();
		addr.setStreet("Khatipura");
		addr.setCity("Jaipur");
		addr.setState("Rajasthan");
		addr.setCountry("India");

		Employee emp = new Employee();
		emp.setName("Anuj");
		emp.setAddress(addr);

		repository.save(emp);
	}

}
