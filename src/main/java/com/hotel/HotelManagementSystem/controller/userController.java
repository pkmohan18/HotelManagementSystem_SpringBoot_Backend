package com.hotel.HotelManagementSystem.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.HotelManagementSystem.entity.hotelUser;
import com.hotel.HotelManagementSystem.service.userService;

@RestController
@RequestMapping("user")
@CrossOrigin
public class userController {
	
	@Autowired
	userService service;
	
	@PostMapping("save")
	public ResponseEntity<String> saveUser(@RequestBody hotelUser user) {
		service.save(user);
		return new ResponseEntity<>("user Saved",HttpStatus.OK);
	}
	
	@GetMapping("get")
	public ResponseEntity<List<hotelUser>> getUSers() {
		List<hotelUser> list = service.getAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@DeleteMapping("delete")
	public ResponseEntity<String> deleteUser(@RequestParam int id){
		service.delete(id);
		return new ResponseEntity<>("User deleted successfully!...",HttpStatus.OK);
	}
	
	@GetMapping("getByEmail")
	public ResponseEntity<hotelUser> getUSersByEmail(@RequestParam String email) {
		hotelUser user = service.getByEmail(email);
		if(user!=null)
			return new ResponseEntity<>(user,HttpStatus.OK);
		else
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	
	
}
