package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.RoleRepository;
import com.dev.delta.repositories.UserRepository;
@Service
public class UserDTO implements DTO {

	@Autowired
	UserRepository  userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	@Override
	public void populate() {
		role.setName("ADMIN");
		roleRepository.save(role);
		user.setPassword("admin");
		user.setUsername("admin");
		user.setRole(role);
		userRepository.save(user);

	}

}
