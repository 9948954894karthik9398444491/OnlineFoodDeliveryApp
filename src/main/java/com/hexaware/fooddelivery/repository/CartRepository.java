package com.hexaware.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.fooddelivery.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{
	
}
