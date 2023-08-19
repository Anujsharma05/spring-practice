package com.practice.transactionamanagement.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.transactionamanagement.entity.BankAccount;
import com.practice.transactionamanagement.repository.BankAccountRepository;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	private BankAccountRepository repository;

	@Autowired
	public BankAccountServiceImpl(BankAccountRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public void transfer(int amount) {
		Optional<BankAccount> obama = repository.findById(1);
		obama.get().setBal(obama.get().getBal() - amount);
		saveAmount(obama.get());

		if (true)
			throw new RuntimeException();

		Optional<BankAccount> trump = repository.findById(2);
		trump.get().setBal(trump.get().getBal() + amount);
		saveAmount(trump.get());
	}

	private void saveAmount(BankAccount acc) {
		repository.save(acc);
	}

}
