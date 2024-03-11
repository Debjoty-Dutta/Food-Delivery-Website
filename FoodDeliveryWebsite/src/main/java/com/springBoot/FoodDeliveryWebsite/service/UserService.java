package com.springBoot.FoodDeliveryWebsite.service;

import com.springBoot.FoodDeliveryWebsite.entity.User;

public interface UserService {
	public User createUser(User user);
	public User getUserById(int id);
	void deleteUser(int id);
	public User updateUser(User user);
}
