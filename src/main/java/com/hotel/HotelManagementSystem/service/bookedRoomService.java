package com.hotel.HotelManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.HotelManagementSystem.entity.bookedRooms;
import com.hotel.HotelManagementSystem.repository.bookedRoomsRepository;

@Service
public class bookedRoomService {

	@Autowired
	bookedRoomsRepository repo;
	
	public void save(bookedRooms room) {
		repo.save(room);
		
	}

	public List<bookedRooms> getAll() {
		return repo.findAll();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

	public bookedRooms getById(int id) {
		return repo.findById(id).get();
	}

	public bookedRooms getByNo(int num) {
		return repo.findByRoomNo(num);
	}

}
