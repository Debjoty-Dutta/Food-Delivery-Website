package com.springBoot.FoodDeliveryWebsite.service;

import com.springBoot.FoodDeliveryWebsite.entity.Admin;

public interface AdminService {
	public Admin createAdmin(Admin admin);
	public Admin getAdminById(int id);
	void deleteAdmin(int id);
	public Admin updateAdmin(Admin admin);
}
