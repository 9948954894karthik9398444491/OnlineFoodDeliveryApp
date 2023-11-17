package com.hexaware.fooddelivery.dto;

public class CartDTO {
	private int cart_id;
	private int customer_id;
	private int restaurant_id;
	private int item_id;
	private double price;
	private int quantity;
	private double total;
	private int order_id;
	
	public CartDTO() {
		super();
	}

	public CartDTO(int cart_id, int customer_id, int restaurant_id, int item_id, double price, int quantity, double total,
			int order_id) {
		super();
		this.cart_id = cart_id;
		this.customer_id = customer_id;
		this.restaurant_id = restaurant_id;
		this.item_id = item_id;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.order_id = order_id;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
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

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", customer_id=" + customer_id + ", restaurant_id=" + restaurant_id
				+ ", item_id=" + item_id + ", price=" + price + ", quantity=" + quantity + ", total=" + total
				+ ", order_id=" + order_id + "]";
	}
	
	
}
