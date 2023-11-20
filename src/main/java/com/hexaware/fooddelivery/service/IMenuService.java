package com.hexaware.fooddelivery.service;

import java.util.List;

import com.hexaware.fooddelivery.dto.MenuDTO;
import com.hexaware.fooddelivery.entity.Menu;

public interface IMenuService {
	public Menu addMenu(MenuDTO menuDTO);
	public MenuDTO getById(int menuItemId);
	public List<Menu> getAllMenu();
	Menu updateMenu(MenuDTO menuDTO);
	void deleteById(int menuItemId);
	
	MenuDTO getByItemName(String itemName);
}
