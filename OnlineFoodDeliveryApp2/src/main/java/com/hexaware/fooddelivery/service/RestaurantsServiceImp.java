package com.hexaware.fooddelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.fooddelivery.dto.RestaurantsDTO;
import com.hexaware.fooddelivery.entity.Restaurants;
import com.hexaware.fooddelivery.exception.OrderNotFoundException;
import com.hexaware.fooddelivery.exception.RestaurantNotFoundException;
import com.hexaware.fooddelivery.repository.RestaurantsRepository;
@Service
public class RestaurantsServiceImp implements IRestaurantsService {
	
	@Autowired
	RestaurantsRepository repo;
	
	@Override
	public Restaurants addRestaurants(RestaurantsDTO restaurantsDTO) {
		Restaurants restaurants=new Restaurants();
		
		
	    
	    restaurants.setRestaurantId(restaurantsDTO.getRestaurantId());
	    restaurants.setRestaurantName(restaurantsDTO.getRestaurantName());
	    restaurants.setCuisineType(restaurantsDTO.getCuisineType());
	    restaurants.setLocation(restaurantsDTO.getLocation());
	    restaurants.setRating(restaurantsDTO.getRating());
	    
	    /*restaurants.setCustomers(restaurantsDTO.getCustomers());
	    restaurants.setMenu(restaurantsDTO.getMenu());
	    restaurants.setOrders(restaurantsDTO.getOrders());*/
		
		
		return repo.save(restaurants);
	}

	@Override
	public RestaurantsDTO getById(int restaurantId) {
		// TODO Auto-generated method stub
		Restaurants restaurants=repo.findById(restaurantId).orElse(new Restaurants());
		if (restaurants.getRestaurantId()==0) {
			  throw new RestaurantNotFoundException(HttpStatus.NOT_FOUND ,"Restaurant with restaurantId:"+restaurantId+" notfound");

		}
		RestaurantsDTO restaurantsDTO=new RestaurantsDTO();
		
		restaurantsDTO.setRestaurantId(restaurants.getRestaurantId());
		restaurantsDTO.setRestaurantName(restaurants.getRestaurantName());
		restaurantsDTO.setCuisineType(restaurants.getCuisineType());
		restaurantsDTO.setLocation(restaurants.getLocation());
		restaurantsDTO.setRating(restaurants.getRating());
		
		
		return restaurantsDTO;
	}

	@Override
	public List<Restaurants> getAllRestaurants() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Restaurants updateRestaurants(RestaurantsDTO restaurantsDTO) {
		// TODO Auto-generated method stub
Restaurants restaurants=new Restaurants();
		
		
	    
	    restaurants.setRestaurantId(restaurantsDTO.getRestaurantId());
	    restaurants.setRestaurantName(restaurantsDTO.getRestaurantName());
	    restaurants.setCuisineType(restaurantsDTO.getCuisineType());
	    restaurants.setLocation(restaurantsDTO.getLocation());
	    restaurants.setRating(restaurantsDTO.getRating());
	    
	   /* restaurants.setCustomers(restaurantsDTO.getCustomers());
	    restaurants.setMenu(restaurantsDTO.getMenu());
	    restaurants.setOrders(restaurantsDTO.getOrders());*/
		
		return repo.save(restaurants);
	}

	@Override
	public void deleteById(int restaurantId) {
		// TODO Auto-generated method stub
		Restaurants restaurants=repo.findById(restaurantId).orElse(null);
		repo.deleteById(restaurants.getRestaurantId());

	}

	@Override
	public RestaurantsDTO getByRestaurantName(String restaurantName) {
		// TODO Auto-generated method stub
		Restaurants restaurants=repo.findByRestaurantName(restaurantName);
		RestaurantsDTO restaurantsDTO=new RestaurantsDTO();
		
		restaurantsDTO.setRestaurantId(restaurants.getRestaurantId());
		restaurantsDTO.setRestaurantName(restaurants.getRestaurantName());
		restaurantsDTO.setCuisineType(restaurants.getCuisineType());
		restaurantsDTO.setLocation(restaurants.getLocation());
		restaurantsDTO.setRating(restaurants.getRating());
		
		
		return restaurantsDTO;
		
	}

}
