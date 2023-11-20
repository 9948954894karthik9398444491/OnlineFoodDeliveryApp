package com.hexaware.fooddelivery.service;

import java.util.List;

import com.hexaware.fooddelivery.dto.AdminDTO;
import com.hexaware.fooddelivery.entity.Admin;

public interface IAdminService {
public Admin addAdmin(AdminDTO adminDTO);
	
	public AdminDTO getById(int adminId);
	
	public List<Admin> getAllAdmin();
	
	Admin updateAdmin(AdminDTO adminDTO);
	
	void deleteById(int adminId);
	 
	public AdminDTO getByAdminName(String userName);
 
}
