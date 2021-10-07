package com.togathertown.codeqna.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.togathertown.codeqna.domain.User;
import com.togathertown.codeqna.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {
	
	private final UserRepository userRepository;

	@PostMapping("/users")
	public ResponseEntity insertUsers(@RequestBody User user) {
		System.out.println(user.toString());
		
		userRepository.save(user);
		
		return new ResponseEntity<>("Success", HttpStatus.OK);
	} 
	
	@GetMapping("/users")
	public List<User> getUsers() {
		List<User> newUser = userRepository.findAll();
		
		return newUser;
	} 
	
}
