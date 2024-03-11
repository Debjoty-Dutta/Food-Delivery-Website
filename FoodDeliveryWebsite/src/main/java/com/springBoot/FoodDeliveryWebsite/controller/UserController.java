package com.springBoot.FoodDeliveryWebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.FoodDeliveryWebsite.entity.User;
import com.springBoot.FoodDeliveryWebsite.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		return userService.createUser(user);
	}
}
