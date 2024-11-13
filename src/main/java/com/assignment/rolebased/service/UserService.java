package com.assignment.rolebased.service;

import java.util.List;

import com.assignment.rolebased.entity.Role;
import com.assignment.rolebased.entity.User;

public interface UserService {

	User saveUser(User user);

	Role saveRole(Role role);

	void addRoleToUser(String username, String rolename);

	User getUser(String username);

	List<User> getUsers();
}
