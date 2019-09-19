package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.zensar.entities.User;

import com.zensar.repositories.UserRepository;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner  {
	@Autowired
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("akshay","kumar"));

		userRepository.save(new User("vikas","sharma"));

		userRepository.save(new User("anshul","mishra"));
	}
}
