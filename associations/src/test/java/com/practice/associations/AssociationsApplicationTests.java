package com.practice.associations;

import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.associations.entity.Customer;
import com.practice.associations.entity.License;
import com.practice.associations.entity.Person;
import com.practice.associations.entity.PhoneNumber;
import com.practice.associations.entity.Programmer;
import com.practice.associations.entity.Project;
import com.practice.associations.repository.CustomerRepository;
import com.practice.associations.repository.LicenseRepository;
import com.practice.associations.repository.ProgrammerRepository;

@SpringBootTest
class AssociationsApplicationTests {

	@Autowired
	private CustomerRepository repository;

	@Autowired
	private ProgrammerRepository programmerRepository;

	@Autowired
	private LicenseRepository licenseRepository;

//	@Test
	void saveCustomer() {
		Customer customer = new Customer();
		customer.setName("Anuj");

		PhoneNumber ph1 = new PhoneNumber();
		ph1.setPhonenumber("1234566");
		ph1.setPhonetype("home");
//		ph1.setCustomer(customer);
		customer.addPhoneNumber(ph1);

		PhoneNumber ph2 = new PhoneNumber();
		ph2.setPhonenumber("33333333");
		ph2.setPhonetype("office");
//		ph2.setCustomer(customer);
		customer.addPhoneNumber(ph2);

		Set<PhoneNumber> phones = new HashSet<>();
		phones.add(ph1);
		phones.add(ph2);
		customer.setNumbers(phones);

		repository.save(customer);
	}

	@Test
//	@Transactional //It is required for lazy loading(default fetch type) to work
	void getCustomer() {
		Optional<Customer> c = repository.findById(13);
		System.out.println(c.get().getName());
		c.get().getNumbers().stream().forEach(number -> System.err.println(number.getPhonenumber()));
	}

	@Test
	void updateCustomer() {
		Optional<Customer> c = repository.findById(13);
		c.get().setName("Chitku");
		c.get().getNumbers().stream().forEach(number -> number.setPhonetype("home"));

		repository.save(c.get());
	}

	@Test
	void deleteCustomer() {
		repository.deleteById(13);
	}

	@Test
	void manyToManySave() {
		Programmer programmer = new Programmer();
		programmer.setName("Anuj");
		programmer.setSalary(10000);

		Set<Project> projects = new HashSet<>();
		Project p = new Project();
		p.setName("spring");
		projects.add(p);

		programmer.setProjects(projects);

		programmerRepository.save(programmer);
	}

	@Test
//	@Transactional
	void manyToManyGet() {

		Optional<Programmer> p = programmerRepository.findById(16);
		System.out.println(p.get());
		System.out.println(p.get().getProjects());
	}

	@Test
	void oneToOneSave() {

		Person p = new Person();
		p.setFirstName("Anuj");
		p.setLastName("Sharma");
		p.setAge(26);

		License l = new License();
		l.setType("car");
		l.setValidFrom(new Date());
		l.setValidTo(new Date());
		l.setPerson(p);

		licenseRepository.save(l);
	}
}
