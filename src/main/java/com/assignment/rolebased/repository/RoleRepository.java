package com.assignment.rolebased.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.rolebased.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
}
