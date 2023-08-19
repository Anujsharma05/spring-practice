package com.practice.hibernateinheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.hibernateinheritance.entity.Check;
import com.practice.hibernateinheritance.entity.CreditCard;
import com.practice.hibernateinheritance.repository.PaymentRepository;

@SpringBootTest
class HibernateinheritanceApplicationTests {

	@Autowired
	private PaymentRepository repository;

	@Test
	void createPaymentCreditCard() {
		CreditCard cc = new CreditCard();
		cc.setId(1);
		cc.setAmount(1000);
		cc.setCardnumber("123456789");
		repository.save(cc);
	}

	@Test
	void createPaymentCheck() {
		Check ch = new Check();
		ch.setId(2);
		ch.setAmount(1000);
		ch.setChecknumber("12345");
		repository.save(ch);
	}

}
