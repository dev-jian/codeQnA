package com.togathertown.codeqna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.togathertown.codeqna.repository.UserRepository;

@SpringBootApplication
public class CodeqnaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CodeqnaApplication.class, args);
		
	}
}
