package com.wenable.User_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wenable.User_Management.Service.UserService;
import com.wenable.User_Management.model.User;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@GetMapping("get_byID/{id}")
	public Optional<User> getUserById(@PathVariable("id") Integer userId) {
		return userService.getUserById(userId);
	} 

	@DeleteMapping("/delete/{id}")
	public  String deleteUser(@PathVariable("id") Integer userId) {
		String result = userService.deleteUser(userId);
		return  result;
	}

	@PutMapping("/update/{id}")
	public  String updateUser(@PathVariable("id") Integer userId, @RequestBody User user) {
		return userService.updateUser(userId, user);
		  
	}

	@GetMapping("/getAll")
	public  List<User> getAllUsers() {
		List<User> users = userService.getAllUsers();
		return  users;
	}
	
	@GetMapping("/get-byPass/{pass}")
	public User getUserByPass(@PathVariable("pass") String pass) {
		return userService.getUserByPass(pass);
	}
}
