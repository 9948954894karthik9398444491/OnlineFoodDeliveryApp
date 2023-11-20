package com.hexaware.fooddelivery.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/*
 * 
 * @Author:Vikas 
 * Date:14-11-2023
 * Description: Entity class of Orders
 * 
 * 
 */
@Entity
public class Orders {
	@Id
	private int cartId;
	
	private int customerId;
	private int restaurantId;
	private String deliveryAddress;
	private String paymentMethod;
	private double totalAmount;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    private Customers customer;

	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	
	
	public Orders() {
		super();
	}
	public Orders(int cartId, int customerId, int restaurantId, String deliveryAddress, String paymentMethod,
			double totalAmount) {
		super();
		this.cartId = cartId;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.deliveryAddress = deliveryAddress;
		this.paymentMethod = paymentMethod;
		this.totalAmount = totalAmount;
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
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}