package com.hexaware.fooddelivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.fooddelivery.dto.CartDTO;
import com.hexaware.fooddelivery.entity.Cart;
import com.hexaware.fooddelivery.entity.Customers;
import com.hexaware.fooddelivery.exception.CartIdNotFoundException;
import com.hexaware.fooddelivery.repository.CartRepository;
import com.hexaware.fooddelivery.repository.CustomersRepository;
@Service
public class CartServiceImp implements ICartService {

	
	@Autowired
	CartRepository repo;
	@Autowired
    CustomersRepository customersRepository;
	
	Logger logger = LoggerFactory.getLogger(CartServiceImp.class);

	
	@Override
	public Cart addCart(CartDTO cartDTO) {
		Customers customers=  customersRepository.findById(cartDTO.getCustomerId()).orElse(null);

		
		Cart cart =new Cart();
		cart.setCustomers(customers);
		
		cart.setCartId(cartDTO.getCartId());
		cart.setCustomerId(cartDTO.getCustomerId());
		cart.setRestaurantId(cartDTO.getRestaurantId());

		cart.setItemId(cartDTO.getItemId());
		cart.setPrice(cartDTO.getPrice());
		cart.setQuantity(cartDTO.getQuantity());
		
		cart.setTotal(cartDTO.getTotal());
		cart.setOrderId(cartDTO.getOrderId());
		
		logger.info("Added to cart with id"+cartDTO.getCartId());

		return repo.save(cart);
	}

	@Override
	public CartDTO getById(int cartId) {
		
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
		
		
		logger.info("Get  cart with id"+cartDTO.getCartId());
		
		
		return cartDTO;
	}

	@Override
	public List<Cart> getAllCart() {
		logger.info("Fetched all cart data");

		return repo.findAll();
	}

	@Override
	public Cart updateCart(CartDTO cartDTO) {
		Cart cart =new Cart();
		cart.setCartId(cartDTO.getCartId());
		cart.setCustomerId(cartDTO.getCustomerId());
		cart.setRestaurantId(cartDTO.getRestaurantId());

		cart.setItemId(cartDTO.getItemId());
		cart.setPrice(cartDTO.getPrice());
		cart.setQuantity(cartDTO.getQuantity());
		
		cart.setTotal(cartDTO.getTotal());
		cart.setOrderId(cartDTO.getOrderId());
		
		logger.info("Updated to cart with id"+cartDTO.getCartId());
		
		return repo.save(cart);
	}

	@Override
	public void deleteById(int cartId) {
	    Cart cart = repo.findById(cartId).orElse(null);

	    

	    if (cart != null) {
	        repo.deleteById(cart.getCartId());
	    }
	    logger.info("Cart deleted");
	}

}
