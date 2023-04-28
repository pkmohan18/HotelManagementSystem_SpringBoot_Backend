package com.hotel.HotelManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.HotelManagementSystem.entity.hotelUser;
import com.hotel.HotelManagementSystem.repository.userRepository;

@Service
public class userService {
	@Autowired
	userRepository repo;
	
	public void save(hotelUser user) {
		repo.save(user);
	}
	
	public List<hotelUser> getAll() {
		return repo.findAll();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}

	public hotelUser getById(int id) {
		return repo.findById(id).get();
	}

	public hotelUser getByEmail(String email) {
		return repo.findByEmail(email);
	}
}
