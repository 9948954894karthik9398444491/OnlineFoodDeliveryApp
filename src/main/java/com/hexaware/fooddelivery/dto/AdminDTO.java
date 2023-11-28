package com.hexaware.fooddelivery.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AdminDTO {
	@NotNull(message="Id should not be null")
	private int adminId;
	@NotBlank(message="Username should not be blank")
	@Size(min=8,max=20,message="Username should be between 8-20 characters")
	private String userName;
	@NotBlank(message = "Password should not be blank")
    @Size(min=6,message="Password must be at least 8 characters long")
  
	private String password;
	private String roles;
	public AdminDTO() {
		super();
	}
	public AdminDTO(int adminId, String userName, String password, String roles) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
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
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}

	
	
	
}