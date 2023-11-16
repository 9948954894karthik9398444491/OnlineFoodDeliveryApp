package com.hexaware.fooddelivery.dto;

import com.hexaware.fooddelivery.entity.Cart;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public class CustomersDTO {
	
	private int customerId;
	@Pattern(regexp = "[a-zA-Z]{2,10}",message = "name minimum of size 2")

	private String customerName;
	@Email(message = "write in email")
	private String email;
	@Pattern(regexp = "[0-9]{10}",message = "number must be of size 10")

	private String phoneNumber;
	@Pattern(regexp = "[a-zA-Z0-9]{2,50}",message = "address minimum of size 2")

	private String deliveryAddress;
	
	/*@OneToOne(cascade = CascadeType.ALL)
	private Cart cart;
	
*/




	public CustomersDTO() {
		super();
	}
	
	
	




	public CustomersDTO(int customerId, String customerName, String email, String phoneNumber, String deliveryAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.deliveryAddress = deliveryAddress;
	}







	public int getCustomerId() {
		return customerId;
	}







	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}







	public String getCustomerName() {
		return customerName;
	}







	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}







	public String getEmail() {
		return email;
	}







	public void setEmail(String email) {
		this.email = email;
	}







	public String getPhoneNumber() {
		return phoneNumber;
	}







	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}







	public String getDeliveryAddress() {
		return deliveryAddress;
	}







	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}







	/*public Cart getCart() {
		return cart;
	}







	public void setCart(Cart cart) {
		this.cart = cart;
	}*/







	
}
