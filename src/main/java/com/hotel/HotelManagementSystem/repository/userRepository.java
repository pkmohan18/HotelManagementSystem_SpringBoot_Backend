package com.hotel.HotelManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.HotelManagementSystem.entity.hotelUser;

@Repository
public interface userRepository extends JpaRepository<hotelUser, Integer> {

	hotelUser findByEmail(String email);
}
