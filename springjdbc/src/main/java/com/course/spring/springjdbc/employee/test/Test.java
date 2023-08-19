package com.course.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.course.spring.springjdbc.employee.dao.EmployeeDao;
import com.course.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springjdbc/employee/test/config.xml");
		EmployeeDao empDao = (EmployeeDao) ctx.getBean("empDao");
		
		List<Employee> list = empDao.read();
		System.out.println(list);
	}

}
