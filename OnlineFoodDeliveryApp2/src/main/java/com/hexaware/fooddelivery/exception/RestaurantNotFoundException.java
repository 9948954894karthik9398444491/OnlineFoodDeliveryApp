package com.hexaware.fooddelivery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class RestaurantNotFoundException extends ResponseStatusException{
	public RestaurantNotFoundException(HttpStatus status,String message) {
		super(status,message);
	}
}
