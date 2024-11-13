package com.assignment.rolebased.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.rolebased.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
