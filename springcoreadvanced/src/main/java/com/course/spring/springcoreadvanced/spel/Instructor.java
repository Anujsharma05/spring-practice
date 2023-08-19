package com.course.spring.springcoreadvanced.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("singleton")
public class Instructor {

	@Value("#{20+20}")
	private int age;

	@Value("#{T(java.lang.Math).abs(-99)}")
	private int id;

	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int accessingStaticVal;

	@Value("#{'durga sir'.toUpperCase()}")
	private String name;

	@Value("#{topics}")
	private List<String> topics;

	@Value("#{true}")
	private boolean active;

	@Autowired
	private Profile profiles;

	@Override
	public String toString() {
		return "Instructor [age=" + age + ", id=" + id + ", accessingStaticVal=" + accessingStaticVal + ", name=" + name
				+ ", topics=" + topics + ", active=" + active + ", profiles=" + profiles + "]";
	}

}
