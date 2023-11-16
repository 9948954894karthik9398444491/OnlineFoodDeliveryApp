package com.hexaware.fooddelivery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class MenuNotFoundException extends ResponseStatusException{
	public MenuNotFoundException(HttpStatus status,String msg) {
		super(status,msg); }
}
