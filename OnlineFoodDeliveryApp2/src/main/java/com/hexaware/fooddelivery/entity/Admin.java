package com.hexaware.fooddelivery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Admin {

	@Id
	private int adminId;
	
	private String userName;
	private String password;
	private String roles;
	public Admin() {
		super();
	}
	public Admin(int adminId, String userName, String password, String roles) {
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

