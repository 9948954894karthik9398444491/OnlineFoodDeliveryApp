package com.hexaware.fooddelivery.dto;

import jakarta.validation.constraints.Min;

public class CartDTO {
	
	private int cartId;
	@Min(value = 100,message = "customerId must greater than 100")
	private int customerId;
	@Min(value = 200,message = "restaurantId must greater than 200")
	private int restaurantId;
	@Min(value = 300,message = "itemId must greater than 300")
	private int itemId;
	@Min(value = 1,message = "price must greater than 1")
	private double price;
	@Min(value = 1,message = "quantity must greater than 1")
	private int quantity;
	@Min(value = 1,message = "total must greater than 1")
	private double total;
	@Min(value = 400,message = "orderId must greater than 400")
	private int orderId;
	
	

	public CartDTO() {
		super();
	}

	public CartDTO(int cartId, int customerId, int restaurantId, int itemId, double price, int quantity, double total,
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

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	

	
	
}
