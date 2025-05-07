package com.wenable.User_Management.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wenable.User_Management.Repository.UserRepository;
import com.wenable.User_Management.model.User;

@Repository
public class UserDao implements IUserDao{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User addUser(User user) {
		if(user!=null) {
		return userRepo.save(user);
		}else {
			return null;
		}
	}
	 
	@Override
	public Optional<User> getUserById(Integer userId) {
		if(userRepo.existsById(userId)) {
        	Optional<User> byId = userRepo.findById(userId);
            return byId; 
        }else {
        	throw new IllegalArgumentException("Invalid user..");
        }
	} 
	
	@Override
	public String deleteUser(Integer userId) {
        if(userRepo.existsById(userId)) {
        	userRepo.deleteById(userId);
            return "User Deleted Successfully!";
        }
        return "User not found!";
    }
	
	@Override
	public  String updateUser(Integer userId, User user) {
		if(userRepo.existsById(userId)) {
			user.setUserId(userId);
			userRepo.save(user);
			return "user update successfully!";
				 }else{
			 return null;
			 
		 }
	}
	
	@Override
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@Override
	public User getUserByPass(String pass) {
		return userRepo.getUserByPass(pass);
		
	}
	
	
}
