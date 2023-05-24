package com.hotel.HotelManagementSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hotel.HotelManagementSystem.controller.userController;
import com.hotel.HotelManagementSystem.entity.hotelUser;
import com.hotel.HotelManagementSystem.service.userService;

@SpringBootTest
class HotelManagementSystemApplicationTests {
	
	@Autowired
	userController userc;
	
	@Autowired
	userService service;

	@Test
	void getUser() {
		assertEquals("manoj", service.getByEmail("manoj@gmail.com").getFname());
	}
	
//	@Test
//	void saveUSer() {
//		hotelUser user = new hotelUser("manoj", "kumar", "2000-10-20", "male", Long.parseLong("8718271827"), "aadhar", "123456789123",
//				"manojkumar@gmail.com", "Manoj@123", "Manoj@123", false, 0);
//		assertEquals("user Saved", userc.saveUser(user).getBody());
//	}
	
	@Test
	void deleteUSer() {
		assertEquals("User deleted successfully!...", userc.deleteUser(14).getBody());
	}
}
