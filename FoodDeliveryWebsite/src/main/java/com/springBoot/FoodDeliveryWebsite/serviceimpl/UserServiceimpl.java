package com.springBoot.FoodDeliveryWebsite.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.FoodDeliveryWebsite.entity.User;
import com.springBoot.FoodDeliveryWebsite.repo.UserRepo;
import com.springBoot.FoodDeliveryWebsite.service.UserService;
@Service
public class UserServiceimpl implements UserService{
	@Autowired
	UserRepo userrepo;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		User us = userrepo.save(user);
		return us;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
