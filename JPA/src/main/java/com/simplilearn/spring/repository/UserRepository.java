package com.simplilearn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.spring.jpa.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByIdUserNotAndUsernameIgnoreCase(int idUser, String username); // Method used for find user
}