package com.course.spring.springorm.passenger.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.course.spring.springorm.passenger.dao.PassengerDao;
import com.course.spring.springorm.passenger.entity.Passenger;

public class Test {
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springorm/passenger/test/config.xml");
		PassengerDao passengerDao = (PassengerDao) ctx.getBean("passengerDao");
		
//		Passenger passenger = new Passenger();
//		passenger.setId(3);
//		passenger.setFirstName("Inosuke");
//		passenger.setLastName("Hashibira");
//		
//		passengerDao.create(passenger);
		
		System.out.println(passengerDao.findAll());
	}
}
