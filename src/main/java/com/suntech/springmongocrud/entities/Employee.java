package com.suntech.springmongocrud.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "EmployeeManagementSystem")
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private String address;
	private String salary;
	private int leaveCount;
	private String department;
	private String lastName;

}
