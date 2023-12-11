package com.hexaware.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.fooddelivery.entity.Orders;
/*
 * 
 * @Author:Karthik 
 * Date:10-11-2023
 * Description:  interface of OrdersRepository
 * 
 * 
 */
public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	
}
