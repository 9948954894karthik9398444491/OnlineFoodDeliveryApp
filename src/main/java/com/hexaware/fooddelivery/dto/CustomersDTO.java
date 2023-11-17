package com.hexaware.fooddelivery.dto;

public class CustomersDTO {
	private int customer_id;
	private String customer_name;
	private String email;
	private String phone_number;
	private String delivery_address;
	
	public CustomersDTO() {
		super();
	}
	
	
	public CustomersDTO(int customer_id, String customer_name, String email, String phone_number,
			String delivery_address) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.email = email;
		this.phone_number = phone_number;
		this.delivery_address = delivery_address;
	}




	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	
}
