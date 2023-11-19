package com.hexaware.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.fooddelivery.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	
}
