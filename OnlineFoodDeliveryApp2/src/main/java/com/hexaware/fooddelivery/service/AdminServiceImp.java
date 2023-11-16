package com.hexaware.fooddelivery.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.fooddelivery.dto.AdminDTO;
import com.hexaware.fooddelivery.entity.Admin;
import com.hexaware.fooddelivery.exception.AdminNotFoundException;
import com.hexaware.fooddelivery.repository.AdminRepository;


@Service
public class AdminServiceImp implements IAdminService {
	
	
	@Autowired
	AdminRepository repo;
	
	@Override
	public Admin addAdmin(AdminDTO adminDTO) {
		Admin admin =new Admin();
		
		
		admin.setAdminId(adminDTO.getAdminId());
		admin.setUserName(adminDTO.getUserName());
		admin.setPassword(adminDTO.getPassword());
		
		return repo.save(admin);
	}

	@Override
	public AdminDTO getById(int adminId) {
		Admin admin = repo.findById(adminId).orElse(new Admin());
		if (admin.getAdminId()==0) {
			throw new AdminNotFoundException(HttpStatus.NOT_FOUND,"admin with adminId:"+adminId+" notfound");

		}
		
		AdminDTO adminDTO = new AdminDTO();
		adminDTO.setAdminId(admin.getAdminId());
		adminDTO.setUserName(admin.getUserName());
		adminDTO.setPassword(admin.getPassword());
		
		
		

		
		return adminDTO;
	}

	@Override
	public List<Admin> getAllAdmin() {
		
		return repo.findAll();
		
	}

	@Override
	public Admin updateAdmin(AdminDTO adminDTO) {
		Admin admin=new Admin();
		admin.setAdminId(adminDTO.getAdminId());
		admin.setUserName(adminDTO.getUserName());
		admin.setPassword(adminDTO.getPassword());
		
		return repo.save(admin);
	}

	@Override
	public void deleteById(int adminId) {
		Admin admin=repo.findById(adminId).orElse(null);
		repo.deleteById(admin.getAdminId());
	}

}
