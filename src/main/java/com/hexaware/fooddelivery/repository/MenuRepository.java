package com.hexaware.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.fooddelivery.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer>{
	Menu findByItemName(String itemName);
}
