package com.springBoot.FoodDeliveryWebsite.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.FoodDeliveryWebsite.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

}
