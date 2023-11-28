package com.hexaware.fooddelivery.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.fooddelivery.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Admin findByuserName(String userName);

}
