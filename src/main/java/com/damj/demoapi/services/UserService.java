package com.damj.demoapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.damj.demoapi.model.users;
import com.damj.demoapi.repository.UserRepository;


@Service
public class UserService {

	    private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<users> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public users createUser(users user) {
	        return userRepository.save(user);
	    }
	}
