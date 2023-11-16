package com.hexaware.fooddelivery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Cart {
	@Id
	private int cartId;
	
	private int customerId;
	
	private int restaurantId;
	private int itemId;
	
	private double price;
	
	private int quantity;
	private double total;
	
	private int orderId;
	
	public Cart() {
		super();
	}

	

	public Cart(int cartId, int customerId, int restaurantId, int itemId, double price, int quantity, double total,
			int orderId) {
		super();
		this.cartId = cartId;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.itemId = itemId;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.orderId = orderId;
	}



	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customer_id) {
		this.customerId = customer_id;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurant_id) {
		this.restaurantId = restaurant_id;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int item_id) {
		this.itemId = item_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int order_id) {
		this.orderId = order_id;
	}



	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", customerId=" + customerId + ", restaurantId=" + restaurantId + ", itemId="
				+ itemId + ", price=" + price + ", quantity=" + quantity + ", total=" + total + ", orderId=" + orderId
				+ "]";
	}

	
	
	
	
}
