package com.practice.associations.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.associations.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
