package com.course.spring.springjdbc.passenger.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.course.spring.springjdbc.passenger.dao.PassengerDao;
import com.course.spring.springjdbc.passenger.dto.Passenger;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springjdbc/passenger/test/config.xml");
		PassengerDao dao = (PassengerDao) ctx.getBean("passengerDao");
		
//		Passenger p = new Passenger();
//		p.setId(2);
//		p.setFirstName("john");
//		p.setLastName("constantine");
//		
//		int records = dao.update(p);
		System.out.println(dao.read());
		
	
	}

}
