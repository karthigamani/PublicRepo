package com.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);
	
}
