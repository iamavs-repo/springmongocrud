package com.suntech.springmongocrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.suntech.springmongocrud.entities.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
