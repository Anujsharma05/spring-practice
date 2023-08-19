package com.practice.transactionamanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.transactionamanagement.service.BankAccountService;

@SpringBootTest
class TransactionamanagementApplicationTests {

	@Autowired
	private BankAccountService bankAccountService;

	@Test
	void contextLoads() {
		bankAccountService.transfer(500);
	}

}
