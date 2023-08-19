package com.practice.associations.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.associations.entity.Programmer;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {

}
