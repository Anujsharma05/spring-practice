package com.practice.hibernateinheritance.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.hibernateinheritance.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
