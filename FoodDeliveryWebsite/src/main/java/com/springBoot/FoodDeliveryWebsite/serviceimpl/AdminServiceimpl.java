package com.springBoot.FoodDeliveryWebsite.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.springBoot.FoodDeliveryWebsite.entity.Admin;
import com.springBoot.FoodDeliveryWebsite.repo.AdminRepo;
import com.springBoot.FoodDeliveryWebsite.service.AdminService;

public class AdminServiceimpl implements AdminService{
	@Autowired
	AdminRepo adminrepo;
	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Admin ad = adminrepo.save(admin);
		return ad;
	}

	@Override
	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

}
