package com.hexaware.fooddelivery.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.fooddelivery.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Admin findByuserName(String userName);
	public Admin findByUserNameAndPassword(String userName, String Password);
	 Optional<Admin> findByUserName(String userName);

}
