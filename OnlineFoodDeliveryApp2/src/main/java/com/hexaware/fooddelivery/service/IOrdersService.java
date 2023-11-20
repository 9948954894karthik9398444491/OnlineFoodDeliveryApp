package com.hexaware.fooddelivery.service;

import java.util.List;

import com.hexaware.fooddelivery.dto.OrdersDTO;
import com.hexaware.fooddelivery.entity.Orders;



public interface IOrdersService {
	public Orders addOrders(OrdersDTO ordersDTO);
	public OrdersDTO getById(int cartId);
	public List<Orders> getAllOrders();
	Orders updateOrders(OrdersDTO ordersDTO);
	void deleteById(int cartId);
}
