package com.hexaware.fooddelivery.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.fooddelivery.entity.Customers;
@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer>{
	  Customers findByCustomerName(String customerName);
}
