package com.springol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springol.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByLastName(String lastName);
}