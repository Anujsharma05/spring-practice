package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee")
public class Employee {

//	@TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_value", allocationSize = 100)
	@GenericGenerator(name = "emp_id", strategy = "com.example.demo.idgenerator.CustomRandomIdGenerator")
	@GeneratedValue(generator = "emp_id")
	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	private long id;
	private String name;

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

}
