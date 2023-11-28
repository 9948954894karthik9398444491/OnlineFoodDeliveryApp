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

import com.hexaware.fooddelivery.dto.MenuDTO;
import com.hexaware.fooddelivery.entity.Menu;
import com.hexaware.fooddelivery.service.IMenuService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/Menu")
public class MenuController {
	
	@Autowired
	IMenuService service;
	@PostMapping("/addMenu")
	public Menu addMenu(@Valid @RequestBody  MenuDTO menuDTO) {
		return service.addMenu(menuDTO);
	}

	@GetMapping("/getById/{menuItemId}")
	public MenuDTO getById( @PathVariable int menuItemId) {
		return service.getById(menuItemId);
	}

	@GetMapping("/getAllMenu")
	public List<Menu> getAllMenu() {
		return service.getAllMenu();
	}

	@PutMapping("/updateMenu")
	public Menu updateMenu( @RequestBody  MenuDTO menuDTO) {
		return service.updateMenu(menuDTO);
	}

	@DeleteMapping("/deleteById/{menuItemId}")
	public void deleteById(@PathVariable int menuItemId) {
		service.deleteById(menuItemId);
	}
	@GetMapping("/getByItemName/{itemName}")
	public MenuDTO getByItemName(@PathVariable String itemName) {
		return service.getByItemName(itemName);
		
	}
}
