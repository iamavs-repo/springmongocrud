package com.suntech.springmongocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createStudent(employee);
	}

	@GetMapping("/getEmployees")
	public List<Employee> getEmployee() {
		return employeeService.getEmployee();
	}

	@GetMapping("/testingItNowAndThen")
	public String testingTodayAgain() {
		return "Working Absolutely Fine Here Guys!";
	}

	@GetMapping("/book/{bookid}")
	private Employee getEmployeesById(@PathVariable("empId") int empId) {
		return employeeService.getBooksById(empId);
	}

}
