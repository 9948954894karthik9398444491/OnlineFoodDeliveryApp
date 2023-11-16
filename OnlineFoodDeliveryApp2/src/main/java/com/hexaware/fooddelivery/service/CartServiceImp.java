package com.hexaware.fooddelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.fooddelivery.dto.CartDTO;
import com.hexaware.fooddelivery.entity.Cart;
import com.hexaware.fooddelivery.exception.AdminNotFoundException;
import com.hexaware.fooddelivery.exception.CartIdNotFoundException;
import com.hexaware.fooddelivery.repository.CartRepository;
@Service
public class CartServiceImp implements ICartService {

	
	@Autowired
	CartRepository repo;
	
	
	@Override
	public Cart addCart(CartDTO cartDTO) {
		// TODO Auto-generated method stub
		Cart cart =new Cart();
		
		
		cart.setCartId(cartDTO.getCartId());
		cart.setCustomerId(cartDTO.getCustomerId());
		cart.setRestaurantId(cartDTO.getRestaurantId());

		cart.setItemId(cartDTO.getItemId());
		cart.setPrice(cartDTO.getPrice());
		cart.setQuantity(cartDTO.getQuantity());
		
		cart.setTotal(cartDTO.getTotal());
		cart.setOrderId(cartDTO.getOrderId());
		
		
		return repo.save(cart);
	}

	@Override
	public CartDTO getById(int cartId) {
		// TODO Auto-generated method stub
		
		Cart cart =repo.findById(cartId).orElse(new Cart());
		if (cart.getCartId()==0) {
			throw new CartIdNotFoundException(HttpStatus.NOT_FOUND,"Cart with CartId:"+cartId+" notfound");

		}
		
		CartDTO cartDTO=new CartDTO();
		cartDTO.setCartId(cart.getCartId());
		cartDTO.setCustomerId(cart.getCustomerId());
		cartDTO.setRestaurantId(cart.getRestaurantId());

		cartDTO.setItemId(cart.getItemId());
		cartDTO.setPrice(cart.getPrice());
		cartDTO.setQuantity(cart.getQuantity());
		
		cartDTO.setTotal(cart.getTotal());
		cartDTO.setOrderId(cart.getOrderId());
		
		
		
		
		
		return cartDTO;
	}

	@Override
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Cart updateCart(CartDTO cartDTO) {
		// TODO Auto-generated method stub
		Cart cart =new Cart();
		cart.setCartId(cartDTO.getCartId());
		cart.setCustomerId(cartDTO.getCustomerId());
		cart.setRestaurantId(cartDTO.getRestaurantId());

		cart.setItemId(cartDTO.getItemId());
		cart.setPrice(cartDTO.getPrice());
		cart.setQuantity(cartDTO.getQuantity());
		
		cart.setTotal(cartDTO.getTotal());
		cart.setOrderId(cartDTO.getOrderId());
		return repo.save(cart);
	}

	@Override
	public void deleteById(int cartId) {
		// TODO Auto-generated method stub
		Cart cart =repo.findById(cartId).orElse(null);
		repo.deleteById(cart.getCartId());


	}

}
