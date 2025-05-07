package com.wenable.User_Management.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.wenable.User_Management.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {
	
	public User getUserByPass(String pass);
} 
