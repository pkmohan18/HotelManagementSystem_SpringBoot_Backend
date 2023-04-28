package com.hotel.HotelManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.HotelManagementSystem.entity.hotelRooms;

@Repository
public interface roomRepository extends JpaRepository<hotelRooms, Integer> {

	hotelRooms findByRoomNo(int num);

}
