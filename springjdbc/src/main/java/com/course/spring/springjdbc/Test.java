package com.course.spring.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/course/spring/springjdbc/config.xml");
		JdbcTemplate template = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		
		String query = "insert into employee values(?, ?, ?)";
		int result = template.update(query, 1, "Anuj", "Sharma");
		System.out.println("no of records inserted: " + result);
	}

}
