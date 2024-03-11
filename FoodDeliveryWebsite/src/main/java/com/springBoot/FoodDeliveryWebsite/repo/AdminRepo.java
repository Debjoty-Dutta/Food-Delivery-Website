package com.springBoot.FoodDeliveryWebsite.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.FoodDeliveryWebsite.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer>{

}
