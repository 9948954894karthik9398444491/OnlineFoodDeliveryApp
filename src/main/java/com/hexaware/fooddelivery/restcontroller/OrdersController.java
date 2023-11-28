package com.hexaware.fooddelivery.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.fooddelivery.dto.OrdersDTO;
import com.hexaware.fooddelivery.entity.Orders;
import com.hexaware.fooddelivery.service.IOrdersService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/Orders")
public class OrdersController {
	@Autowired
	IOrdersService service;
	
	@PostMapping("/addOrders")
	public Orders addOrders(@Valid @RequestBody OrdersDTO ordersDTO) {
		return service.addOrders(ordersDTO);
	}

	@GetMapping("/getById/{cartId}")
	public OrdersDTO getById(@PathVariable int cartId) {
		return service.getById(cartId);
	}

	@GetMapping("/getAllOrders")
	public List<Orders> getAllOrders() {
		return service.getAllOrders();
	}

	@PutMapping("/updateOrders")
	public Orders updateOrders( @RequestBody OrdersDTO ordersDTO) {
		return service.updateOrders(ordersDTO);
	}

	@DeleteMapping("/deleteById/{cartId}")
	public void deleteById(@PathVariable int cartId) {
		service.deleteById(cartId);
	}
}
