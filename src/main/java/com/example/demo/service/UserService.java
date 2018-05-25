package com.example.demo.service;

import java.util.Set;

import com.example.demo.domain.User;
import com.example.demo.domain.security.UserRole;

public interface UserService {
	
	User createUser(User user, Set<UserRole> userRoles);

}

