package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
//@RequestMapping("/empployee")
@CrossOrigin(origins="")
public class EmpController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee employee) {
		 //String saveEmployee = service.saveEmployee(employee);
		System.out.println("welcome to save page");
		return service.saveEmployee(employee);
	}
	
	@GetMapping("/allEmp")
	public List<Employee> getAllEmployee(){
		
		return service.getAllEmployee();
	}
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	

}
