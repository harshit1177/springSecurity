package com.gl.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.springboot.model.User;
import com.gl.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
