package com.suntech.springmongocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suntech.springmongocrud.entities.Employee;
import com.suntech.springmongocrud.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployees")
	public Employee createEmployee(@RequestBody Employee employee)
	{
		return employeeService.createStudent(employee);
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployee()
	{
		return employeeService.getEmployee();
	}
	
	@GetMapping("/testIt")
	public String testing()
	{
		return "All Good";
	}

}
