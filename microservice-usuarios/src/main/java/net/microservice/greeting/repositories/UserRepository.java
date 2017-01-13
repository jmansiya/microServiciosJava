package net.microservice.greeting.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.microservice.greeting.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	public User findByUserId(String userId);
	
	public User findByName(String name);
	
}
