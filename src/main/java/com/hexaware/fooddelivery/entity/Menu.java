package com.hexaware.fooddelivery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Menu {
	@Id
	private int menu_item_id;
	private int restaurant_id;
	private String item_name;
	private String description;
	private double price;
	private boolean availability;
	public Menu() {
		super();
	}
	public Menu(int menu_item_id, int restaurant_id, String item_name, String description, double price,
			boolean availability) {
		super();
		this.menu_item_id = menu_item_id;
		this.restaurant_id = restaurant_id;
		this.item_name = item_name;
		this.description = description;
		this.price = price;
		this.availability = availability;
	}
	public int getMenu_item_id() {
		return menu_item_id;
	}
	public void setMenu_item_id(int menu_item_id) {
		this.menu_item_id = menu_item_id;
	}
	public int getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	
}
