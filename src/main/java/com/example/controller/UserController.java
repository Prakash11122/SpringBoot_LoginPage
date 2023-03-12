package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.EmployeeRepo;
import com.example.Repository.UserRepo;
import com.example.entity.User;
import com.example.service.UserService;

@RestController
//@RequestMapping("/user ")
@CrossOrigin(origins = "")
public class UserController {
	@Autowired
	private UserService Uservice;
	
	@PostMapping("/userSave")
	public String saveUser(@RequestBody User user) {
		return Uservice.saveUser(user) ;
	}
	@GetMapping("/validate")
	public String validateUser(@RequestBody User user) {
		return Uservice.validateUser(user);
	}
	
	
	

}
