package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.EmployeeRepo;
import com.example.entity.Employee;
import com.example.service.EmployeeService;
@Service
public class EmployeeServiceImpl  implements EmployeeService{
	@Autowired
	private EmployeeRepo emprepo;
	
	@Override
	public String saveEmployee(Employee employee) {
		  emprepo.save(employee);
		return "save success";
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return emprepo.findAll(); 
	}

	@Override
	public String updateEmployee(Employee employee) {
		emprepo.save(employee);
		return "update success";
	}

}
