package com.app.flightbooking.service;

import com.app.flightbooking.entity.User;

import java.util.List;

public interface UserService {

	List<User> findAll();
	User findById(int userId);
	User save(User user);
	void deleteById(int userId);
	
}
