package com.tutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.dto.UserDto;
import com.tutorial.model.User;
import com.tutorial.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;

	public User save(UserDto userDto) {
		User user = new User(userDto.getEmail(), userDto.getPassword(), userDto.getRole(), userDto.getFullname());

		return userRepository.save(user);
	}

}
