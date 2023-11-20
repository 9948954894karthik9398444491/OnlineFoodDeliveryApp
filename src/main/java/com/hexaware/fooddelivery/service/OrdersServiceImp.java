package com.hexaware.fooddelivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.fooddelivery.dto.OrdersDTO;
import com.hexaware.fooddelivery.entity.Customers;
import com.hexaware.fooddelivery.entity.Orders;
import com.hexaware.fooddelivery.exception.OrderNotFoundException;
import com.hexaware.fooddelivery.repository.CustomersRepository;
import com.hexaware.fooddelivery.repository.OrdersRepository;

@Service
public class OrdersServiceImp implements IOrdersService {
	@Autowired
	OrdersRepository repo;
	
	@Autowired
	CustomersRepository CustomerRepo;
	
	
	Logger logger = LoggerFactory.getLogger(OrdersServiceImpTest.class);

	@Override
	public Orders addOrders(OrdersDTO ordersDTO) {
		Customers customer=CustomerRepo.findById(ordersDTO.getCustomerId()).orElse(null);
		
		
		
		
		Orders orders = new Orders();
		orders.setCustomer(customer);
			
		orders.setCartId(ordersDTO.getCartId());
		orders.setCustomerId(ordersDTO.getCustomerId());
		orders.setRestaurantId(ordersDTO.getRestaurantId());
		orders.setDeliveryAddress(ordersDTO.getDeliveryAddress());
		orders.setPaymentMethod(ordersDTO.getPaymentMethod());
		orders.setTotalAmount(ordersDTO.getTotalAmount());
		logger.info("Added to Orders with id"+ordersDTO.getCartId());


		return repo.save(orders);
	}

	@Override
	public OrdersDTO getById(int cartId) {
		
		Orders orders=repo.findById(cartId).orElse(new Orders());
		if (orders.getCartId()==0) {
			  throw new OrderNotFoundException(HttpStatus.NOT_FOUND ,"Orders with cartId:"+cartId+" notfound");
		}
		OrdersDTO ordersDTO=new OrdersDTO();
		
		ordersDTO.setCartId(orders.getCartId());
		ordersDTO.setCustomerId(orders.getCustomerId());
		ordersDTO.setRestaurantId(orders.getRestaurantId());
		ordersDTO.setDeliveryAddress(orders.getDeliveryAddress());
		ordersDTO.setPaymentMethod(orders.getPaymentMethod());
		ordersDTO.setTotalAmount(orders.getTotalAmount());
		
		logger.info("Get  Orders with id"+orders.getCartId());

		return ordersDTO;
	}

	@Override
	public List<Orders> getAllOrders() {
		logger.info("Fetched all Orders data");

		return repo.findAll();
	}

	@Override
	public Orders updateOrders(OrdersDTO ordersDTO) {
		Orders orders = new Orders();
		
		
		orders.setCartId(ordersDTO.getCartId());
		orders.setCustomerId(ordersDTO.getCustomerId());
		orders.setRestaurantId(ordersDTO.getRestaurantId());
		orders.setDeliveryAddress(ordersDTO.getDeliveryAddress());
		orders.setPaymentMethod(ordersDTO.getPaymentMethod());
		orders.setTotalAmount(ordersDTO.getTotalAmount());
		logger.info("Updated to Orders with id"+ordersDTO.getCartId());

		return repo.save(orders);
	}

	@Override
	public void deleteById(int cartId) {
	    Orders orders = repo.findById(cartId).orElse(null);

	    logger.info("Orders deleted");

	    if (orders != null) {
	        repo.deleteById(orders.getCartId());
	    }
	}


}
