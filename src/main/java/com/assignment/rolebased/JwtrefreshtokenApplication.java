package com.assignment.rolebased;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.assignment.rolebased.entity.Role;
import com.assignment.rolebased.entity.User;
import com.assignment.rolebased.service.UserService;

@SpringBootConfiguration
public class JwtrefreshtokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtrefreshtokenApplication.class, args);
	}

	@Bean
		PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService
			) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "Aryan khan", "aryan", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Masum khan", "masum", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "kunal singh", "kunal", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Fayaz shaikh", "fayaz", "1234", new ArrayList<>()));

			userService.addRoleToUser("aryan", "ROLE_USER");
			userService.addRoleToUser("aryan", "ROLE_MANAGER");
			userService.addRoleToUser("masum", "ROLE_MANAGER");
			userService.addRoleToUser("kunal", "ROLE_ADMIN");
			userService.addRoleToUser("fayaz", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("masum", "ROLE_ADMIN");
			userService.addRoleToUser("fayaz", "ROLE_USER");

		};
	}

}
