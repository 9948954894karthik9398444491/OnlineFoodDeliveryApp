package com.hexaware.fooddelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.fooddelivery.dto.CustomersDTO;
import com.hexaware.fooddelivery.entity.Cart;
import com.hexaware.fooddelivery.entity.Customers;
import com.hexaware.fooddelivery.exception.CustomerNotFoundException;
import com.hexaware.fooddelivery.repository.CustomersRepository;
@Service
public class CustomersServiceImp implements ICustomersService {
	
	
	@Autowired
	CustomersRepository repo;
	
	/*
	@Override
	public CustomersDTO getById(int customerId) {
	    Customers customers = repo.findById(customerId)
	                                .orElseThrow(() -> new CustomerNotFoundException("Customer not found"));
	    List<Cart> carts = customers.getCarts(); // Retrieve associated carts if needed
	}  */

	@Override
	public Customers addCustomers(CustomersDTO customersDTO) {
		// TODO Auto-generated method stub
		
		Customers customers=new Customers();
		
		customers.setCustomerId(customersDTO.getCustomerId());
		customers.setCustomerName(customersDTO.getCustomerName());
		customers.setEmail(customersDTO.getEmail());
		customers.setPhoneNumber(customersDTO.getPhoneNumber());
		customers.setDeliveryAddress(customersDTO.getDeliveryAddress());
		//customers.setCart(customersDTO.getCart());

		return repo.save(customers);
	}
	

	@Override
	public CustomersDTO getById(int customerId) {
		// TODO Auto-generated method stub
		
		Customers customers=repo.findById(customerId).orElse(new Customers());
		if (customers.getCustomerId()==0) {
			throw new CustomerNotFoundException(HttpStatus.NOT_FOUND,"Customer with customerId:"+customerId+" notfound");

		}
		
		
		CustomersDTO customersDTO=new CustomersDTO();
		
		customersDTO.setCustomerId(customers.getCustomerId());
		customersDTO.setCustomerName(customers.getCustomerName());
		customersDTO.setEmail(customers.getEmail());
		customersDTO.setPhoneNumber(customers.getPhoneNumber());
		customersDTO.setDeliveryAddress(customers.getDeliveryAddress());
		
		return customersDTO;
	}

	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customers updateCustomers(CustomersDTO customersDTO) {
		// TODO Auto-generated method stub
		Customers customers=new Customers();
		
		customers.setCustomerId(customersDTO.getCustomerId());
		customers.setCustomerName(customersDTO.getCustomerName());
		customers.setEmail(customersDTO.getEmail());
		customers.setPhoneNumber(customersDTO.getPhoneNumber());
		customers.setDeliveryAddress(customersDTO.getDeliveryAddress());
		//customers.setCart(customersDTO.getCart());

		return repo.save(customers);
	}

	@Override
	public void deleteById(int customerId) {
		// TODO Auto-generated method stub
		Customers customers=repo.findById(customerId).orElse(null);
		repo.deleteById(customers.getCustomerId());
		

	}

	@Override
	public CustomersDTO getByCustomerName(String customerName) {
		
		Customers customers=repo.findByCustomerName(customerName);
		Customers customersId=repo.findById(customers.getCustomerId()).orElse(new Customers());
		if(customersId.getCustomerId()==0) {
			throw new CustomerNotFoundException(HttpStatus.NOT_FOUND,"Customer with customerName:"+customerName+" notfound");

		}
CustomersDTO customersDTO=new CustomersDTO();
		
		customersDTO.setCustomerId(customers.getCustomerId());
		customersDTO.setCustomerName(customers.getCustomerName());
		customersDTO.setEmail(customers.getEmail());
		customersDTO.setPhoneNumber(customers.getPhoneNumber());
		customersDTO.setDeliveryAddress(customers.getDeliveryAddress());
		
		return customersDTO;
		
		
		
	}

}
