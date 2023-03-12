package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
	//@Query("select  userName,password from User")
	public List<User> findByUserNameAndPassword(String userName, String password);

}
