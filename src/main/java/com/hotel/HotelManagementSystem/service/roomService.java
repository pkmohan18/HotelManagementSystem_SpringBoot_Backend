package com.hotel.HotelManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.HotelManagementSystem.entity.hotelRooms;
import com.hotel.HotelManagementSystem.repository.roomRepository;

@Service
public class roomService {
	
	@Autowired
	roomRepository repo;

	public void save(hotelRooms room) {
		repo.save(room);
		
	}

	public List<hotelRooms> getAll() {
		return repo.findAll();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

	public hotelRooms getById(int id) {
		return repo.findById(id).get();
	}

	public hotelRooms getByNo(int num) {
		return repo.findByRoomNo(num);
	}
	
}
