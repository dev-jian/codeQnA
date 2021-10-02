package com.togathertown.codeqna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.togathertown.codeqna.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
