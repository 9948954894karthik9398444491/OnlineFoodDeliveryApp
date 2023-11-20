package com.hexaware.fooddelivery.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.hexaware.fooddelivery.entity.Orders;

class OrdersServiceImpTest {

	
	@Test
	void testAddOrders() {
		Orders orders = new Orders();
		orders.setCartId(100);
		orders.setCustomerId(150);
		orders.setRestaurantId(100);
		orders.setDeliveryAddress("Ongole");
		orders.setPaymentMethod("COD");
		orders.setTotalAmount(500);
		assertEquals(100,orders.getRestaurantId());
	}

	@Test
	void testGetById() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllOrders() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateOrders() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteById() {
		fail("Not yet implemented");
	}

}
