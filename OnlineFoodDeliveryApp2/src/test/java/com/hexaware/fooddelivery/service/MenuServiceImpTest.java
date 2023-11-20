package com.hexaware.fooddelivery.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;

import com.hexaware.fooddelivery.dto.MenuDTO;
import com.hexaware.fooddelivery.entity.Menu;
import com.hexaware.fooddelivery.exception.MenuNotFoundException;
import com.hexaware.fooddelivery.repository.MenuRepository;
import com.hexaware.fooddelivery.service.MenuSeviceImp;

@ExtendWith(MockitoExtension.class)
public class MenuServiceImpTest {

    @Mock
    private MenuRepository repo;

    @InjectMocks
    private MenuSeviceImp service;

    @Test
    void testAddMenu() {
        // Arrange
        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setMenuItemId(1);
        menuDTO.setRestaurantId(201);
        menuDTO.setItemName("Burger");
        menuDTO.setDescription("Delicious Burger");
        menuDTO.setPrice(150.0);

        Menu savedMenu = new Menu();
        savedMenu.setMenuItemId(1);
        savedMenu.setRestaurantId(201);
        savedMenu.setItemName("Burger");
        savedMenu.setDescription("Delicious Burger");
        savedMenu.setPrice(150.0);

        when(repo.save(Mockito.any(Menu.class))).thenReturn(savedMenu);

        // Act
        Menu result = service.addMenu(menuDTO);

        // Assert
        assertEquals(savedMenu, result);
        verify(repo).save(Mockito.any(Menu.class));
    }

    @Test
    void testGetById() {
        // Arrange
        int menuItemId = 1;

        Menu menu = new Menu();
        menu.setMenuItemId(menuItemId);
        menu.setRestaurantId(201);
        menu.setItemName("Burger");
        menu.setDescription("Delicious Burger");
        menu.setPrice(150.0);

        when(repo.findById(menuItemId)).thenReturn(Optional.of(menu));

        // Act
        MenuDTO result = service.getById(menuItemId);

        // Assert
        assertEquals(menuDTOFromEntity(menu), result);
    }

    @Test
    void testGetById_NotFound() {
        // Arrange
        int menuItemId = 1;

        when(repo.findById(menuItemId)).thenReturn(Optional.empty());

        // Act and Assert
        assertThrows(MenuNotFoundException.class, () -> service.getById(menuItemId));
    }

    @Test
    void testGetAllMenu() {
        // Arrange
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu(1, 201, "Burger", "Delicious Burger", 150.0));
        menuList.add(new Menu(2, 201, "Pizza", "Tasty Pizza", 200.0));

        when(repo.findAll()).thenReturn(menuList);

        // Act
        List<Menu> result = service.getAllMenu();

        // Assert
        assertEquals(menuList, result);
    }

    @Test
    void testUpdateMenu() {
        // Arrange
        int menuItemId = 1;
        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setMenuItemId(menuItemId);
        menuDTO.setRestaurantId(201);
        menuDTO.setItemName("Updated Burger");
        menuDTO.setDescription("Even More Delicious Burger");
        menuDTO.setPrice(180.0);

        Menu existingMenu = new Menu();
        existingMenu.setMenuItemId(menuItemId);
        existingMenu.setRestaurantId(201);
        existingMenu.setItemName("Burger");
        existingMenu.setDescription("Delicious Burger");
        existingMenu.setPrice(150.0);

        Menu updatedMenu = new Menu();
        updatedMenu.setMenuItemId(menuItemId);
        updatedMenu.setRestaurantId(201);
        updatedMenu.setItemName("Updated Burger");
        updatedMenu.setDescription("Even More Delicious Burger");
        updatedMenu.setPrice(180.0);

        when(repo.findById(menuItemId)).thenReturn(Optional.of(existingMenu));
        when(repo.save(Mockito.any(Menu.class))).thenReturn(updatedMenu);

        // Act
        Menu result = service.updateMenu(menuDTO);

        // Assert
        assertEquals(updatedMenu, result);
        verify(repo).findById(menuItemId);
        verify(repo).save(Mockito.any(Menu.class));
    }

    @Test
    void testDeleteById() {
        // Arrange
        int menuItemId = 1;

        Menu existingMenu = new Menu();
        existingMenu.setMenuItemId(menuItemId);
        existingMenu.setRestaurantId(201);
        existingMenu.setItemName("Burger");
        existingMenu.setDescription("Delicious Burger");
        existingMenu.setPrice(150.0);

        when(repo.findById(menuItemId)).thenReturn(Optional.of(existingMenu));

        // Act
        service.deleteById(menuItemId);

        // Assert
        verify(repo).findById(menuItemId);
        verify(repo).deleteById(menuItemId);
    }

  

    @Test
    void testGetByItemName() {
        // Arrange
        String itemName = "Burger";

        Menu menu = new Menu();
        menu.setMenuItemId(1);
        menu.setRestaurantId(201);
        menu.setItemName(itemName);
        menu.setDescription("Delicious Burger");
        menu.setPrice(150.0);

        when(repo.findByItemName(itemName)).thenReturn(menu);

        // Act
        MenuDTO result = service.getByItemName(itemName);

        // Assert
        assertEquals(menuDTOFromEntity(menu), result);
    }

    @Test
    void testGetByItemName_NotFound() {
        // Arrange
        String itemName = "NonExistentItem";

        when(repo.findByItemName(itemName)).thenReturn(null);

        // Act and Assert
        assertThrows(MenuNotFoundException.class, () -> service.getByItemName(itemName));
    }

    private MenuDTO menuDTOFromEntity(Menu menu) {
        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setMenuItemId(menu.getMenuItemId());
        menuDTO.setRestaurantId(menu.getRestaurantId());
        menuDTO.setItemName(menu.getItemName());
        menuDTO.setDescription(menu.getDescription());
        menuDTO.setPrice(menu.getPrice());
        return menuDTO;
    }
}
