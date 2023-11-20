package com.hexaware.fooddelivery.service;

import java.util.List;

import com.hexaware.fooddelivery.dto.CartDTO;
import com.hexaware.fooddelivery.entity.Cart;



public interface ICartService {
	
	
	public Cart addCart(CartDTO cartDTO);
	public CartDTO getById(int cartId);
	public List<Cart> getAllCart();
	Cart updateCart(CartDTO cartDTO);
	void deleteById(int cartId);
}
