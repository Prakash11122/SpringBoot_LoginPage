package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.UserRepo;
import com.example.entity.User;
import com.example.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo userRepo;

	@Override
	public String saveUser(User user) {
		userRepo.save(user);
		return "save";
	}

	@Override
	public String validateUser(User user) {
	 List<User> findByUserNameAndPassword = userRepo.findByUserNameAndPassword(
				user.getUserName(),
				user.getPassword()
				);
		if(findByUserNameAndPassword != null)
		{
		return "user login successfully";
	}
		else {
		return "user login invalid";

	}
}
}