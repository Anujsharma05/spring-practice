package com.example.demo.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.demo.entity.Student;

public class StudentDTO {
	private long id;
	@NotBlank
	@Size(max = 30)
	private String name;
	@Max(110)
	private int age;

	public StudentDTO() {
	}

	public StudentDTO(Student student) {
		id = student.getId();
		name = student.getName();
		age = student.getAge();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
