package com.hotel.HotelManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.HotelManagementSystem.entity.bookedRooms;

@Repository
public interface bookedRoomsRepository extends JpaRepository<bookedRooms, Integer> {

	bookedRooms findByRoomNo(int num);
		
}	
