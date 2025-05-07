package com.wenable.User_Management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenable.User_Management.dao.UserDao;
import com.wenable.User_Management.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User addUser(User user) {
		return userDao.addUser(user);
	}
	 
	public Optional<User> getUserById(Integer userId) {
		return userDao.getUserById(userId);
	} 
	
	public String deleteUser(Integer userId) {
        
        return userDao.deleteUser(userId);
    }
	
	public  String updateUser(Integer userId, User user) {
		 return userDao.updateUser(userId, user);
	}
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
	
	public User getUserByPass(String pass) {
		return userDao.getUserByPass(pass);
	}
	
}