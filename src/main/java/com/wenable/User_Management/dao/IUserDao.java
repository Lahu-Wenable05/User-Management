package com.wenable.User_Management.dao;

import java.util.List;
import java.util.Optional;

import com.wenable.User_Management.model.User;

public interface IUserDao {
	
		public User addUser(User user);
		 
		public Optional<User> getUserById(Integer userId);  
		
		public String deleteUser(Integer userId);
		
		public  String updateUser(Integer userId, User user);
		
		public List<User> getAllUsers();
		
		public User getUserByPass(String pass);  

}
