package net.microservice.greeting.service;

import java.util.List;

import net.microservice.greeting.model.User;

public interface UserService {
	List<User> findAll();
	
	User findByUserId(String userID);
	
	User saveUser(User user);
	
	void deleteUser(User user);
}
