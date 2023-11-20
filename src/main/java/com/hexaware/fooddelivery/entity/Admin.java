package com.hexaware.fooddelivery.entity;

import jakarta.persistence.Entity;
/*
 * 
 * @Author:Karthik
 * Date:14-11-2023
 * Description: Entity class of Orders
 * 
 * 
 */
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	
	@Id
	private int adminId;
    private String userName;
    private String password;
    private final String role="ADMIN";
	public Admin() {
		super();
	}
	public Admin(int adminId, String userName, String password) {
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
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", userName=" + userName + ", password=" + password + ", role=" + role
				+ "]";
	}
	
	
	
	
	
	

}