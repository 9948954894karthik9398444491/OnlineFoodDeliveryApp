package com.hexaware.fooddelivery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CartIdNotFoundException extends ResponseStatusException{
	public CartIdNotFoundException(HttpStatus status,String msg) {
		super(status,msg); }
}
