package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {
	
	public String saveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public String updateEmployee(Employee employee);

}
