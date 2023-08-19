package com.practice.associations.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.associations.entity.License;

public interface LicenseRepository extends CrudRepository<License, Long> {

}
