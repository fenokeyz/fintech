package com.example.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.entity.User;
import com.example.demo2.service.UserService;

@RestController
@RequestMapping("/api")


public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUser")
	
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/addUser")
	public User createUser(@RequestBody User user) {
		 return userService.saveUser(user);
	 }
	
	
	

}
