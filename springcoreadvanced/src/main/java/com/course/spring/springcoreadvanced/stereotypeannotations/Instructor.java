package com.course.spring.springcoreadvanced.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("singleton")
public class Instructor {

	@Value("32")
	private int id = 11;

	@Value("DurgaSir")
	private String name = "will be overwritten";

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private Profile profiles;

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profiles + "]";
	}

}
