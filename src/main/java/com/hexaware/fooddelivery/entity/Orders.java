package com.hexaware.fooddelivery.entity;


public class Orders {
	private int cart_id;
	private int customer_id;
	private int restaurant_id;
	private String order_date;
	private String delivery_address;
	private String payment_method;
	private double total_amount;
	
	
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
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public Orders() {
		super();
	}
	
	public Orders(int cart_id, int customer_id, int restaurant_id, String order_date, String delivery_address,
			String payment_method, double total_amount) {
		super();
		this.cart_id = cart_id;
		this.customer_id = customer_id;
		this.restaurant_id = restaurant_id;
		this.order_date = order_date;
		this.delivery_address = delivery_address;
		this.payment_method = payment_method;
		this.total_amount = total_amount;
	}
}
