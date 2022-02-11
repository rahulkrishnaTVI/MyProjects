package com.cma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cma.entity.Users;
import com.cma.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public void saveUser(Users users) {
		userRepository.save(users);
	}
	
	public List<Users> getUser() {
		return userRepository.findAll();
	}

}
