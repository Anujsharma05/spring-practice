package com.practice.hibernateinheritance.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("ch")
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "bankcheck")
public class Check extends Payment {

	private String checknumber;

	public String getChecknumber() {
		return checknumber;
	}

	public void setChecknumber(String checknumber) {
		this.checknumber = checknumber;
	}

}
