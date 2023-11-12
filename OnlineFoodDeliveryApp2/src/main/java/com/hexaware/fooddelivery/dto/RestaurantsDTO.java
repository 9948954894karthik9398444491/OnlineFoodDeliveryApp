package com.hexaware.fooddelivery.dto;

import com.hexaware.fooddelivery.entity.Customers;
import com.hexaware.fooddelivery.entity.Menu;
import com.hexaware.fooddelivery.entity.Orders;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;

public class RestaurantsDTO {

	private int restaurantId ;
	private String restaurantName ;
    private String cuisineType;
    private String location;
    private double rating;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Customers customers;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Menu menu;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Orders orders;
    
	public RestaurantsDTO() {
		super();
	}
	public RestaurantsDTO(int restaurantId, String restaurantName, String cuisineType, String location, double rating) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.cuisineType = cuisineType;
		this.location = location;
		this.rating = rating;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCuisineType() {
		return cuisineType;
	}
	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
    

}