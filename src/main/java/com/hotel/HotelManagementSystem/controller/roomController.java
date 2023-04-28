package com.hotel.HotelManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.HotelManagementSystem.entity.hotelRooms;
import com.hotel.HotelManagementSystem.service.roomService;

@Controller
@RequestMapping("room")
@CrossOrigin
public class roomController {
	
	@Autowired
	roomService service;
	
	@PostMapping("save")
	public ResponseEntity<String> saveRoom(@RequestBody hotelRooms room) {
		service.save(room);
		return new ResponseEntity<>("Room Saved",HttpStatus.OK);
	}
	
	@GetMapping("get")
	public ResponseEntity<List<hotelRooms>> getRooms() {
		List<hotelRooms> list = service.getAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@DeleteMapping("delete")
	public ResponseEntity<String> deleteRoom(@RequestParam int id){
		service.delete(id);
		return new ResponseEntity<>("Room deleted successfully!...",HttpStatus.OK);
	}
	
	@GetMapping("getById")
	public ResponseEntity<hotelRooms> getRoomById(@RequestParam int id) {
		hotelRooms room = service.getById(id);
		if(room!=null)
			return new ResponseEntity<>(room,HttpStatus.OK);
		else
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("getByNo")
	public ResponseEntity<hotelRooms> getRoomByRoomNo(@RequestParam int num) {
		hotelRooms room = service.getByNo(num);
		if(room!=null)
			return new ResponseEntity<>(room,HttpStatus.OK);
		else
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	
}
