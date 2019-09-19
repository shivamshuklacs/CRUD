package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.User;
import com.zensar.repositories.UserRepository;

@RestController
@RequestMapping("/api")
public class UserControllers {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	public List <User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public List getUsers(@PathVariable Long id){
		return userRepository.findAll();
	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return true;
	}
	
	@PostMapping("/user")
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/user")
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
}
