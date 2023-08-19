package com.practice.hibernateinheritance.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("cc")
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "card")
public class CreditCard extends Payment {

	private String cardnumber;

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

}
