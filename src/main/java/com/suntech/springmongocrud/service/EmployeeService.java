package com.suntech.springmongocrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suntech.springmongocrud.entities.Employee;
import com.suntech.springmongocrud.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee createStudent(Employee employee) {

		return employeeRepository.save(employee);

	}

	public List<Employee> getEmployee() {

		return employeeRepository.findAll();
	}

	public Employee getEmployeesById(int empId) {

		return employeeRepository.findById(empId).get();
	}

}