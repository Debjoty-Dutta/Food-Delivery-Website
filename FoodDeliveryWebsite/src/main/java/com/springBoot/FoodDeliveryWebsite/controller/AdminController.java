package com.springBoot.FoodDeliveryWebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.FoodDeliveryWebsite.entity.Admin;
import com.springBoot.FoodDeliveryWebsite.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminservice;
	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return adminservice.createAdmin(admin);
	}
}
