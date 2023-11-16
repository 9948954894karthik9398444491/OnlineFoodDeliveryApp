package com.hexaware.fooddelivery.dto;

import jakarta.validation.constraints.Pattern;

public class AdminDTO {
	private int adminId;
	@Pattern(regexp = "[a-zA-Z]{2,10}",message = "name minimum of size 2")
	private String userName;
	@Pattern(regexp = "[a-zA-Z0-9]{6,15}",message = "must be 6 characters")
	private String password;

	
	public AdminDTO() {
		super();
	}


	public AdminDTO(int adminId, String userName, String password) {
		super();
		this.adminId = adminId;
		
		this.userName = userName;
		this.password = password;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "AdminDTO [adminId=" + adminId + ", userName=" + userName + ", password=" + password + "]";
	}


	
}
