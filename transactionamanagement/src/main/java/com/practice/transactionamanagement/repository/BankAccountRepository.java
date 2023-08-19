package com.practice.transactionamanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.transactionamanagement.entity.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {

}
