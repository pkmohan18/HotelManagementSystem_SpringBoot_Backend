package com.hotel.HotelManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class bookedRooms {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int roomNo;
	private String user;
	private String roomType;
	private String capacity;
	private String checkIn;
	private String checkOut;
	private int noDays;
	private int totPrice;
	private String isApproved;
	
	public bookedRooms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public bookedRooms(int roomNo, String user, String roomType, String capacity, String checkIn, String checkOut,
			int noDays, int totPrice, String isApproved) {
		super();
		this.roomNo = roomNo;
		this.user = user;
		this.roomType = roomType;
		this.capacity = capacity;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.noDays = noDays;
		this.totPrice = totPrice;
		this.isApproved = isApproved;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public int getNoDays() {
		return noDays;
	}

	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}

	public int getTotPrice() {
		return totPrice;
	}

	public void setTotPrice(int totPrice) {
		this.totPrice = totPrice;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "bookedRooms [id=" + id + ", roomNo=" + roomNo + ", user=" + user + ", roomType=" + roomType
				+ ", capacity=" + capacity + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", noDays=" + noDays
				+ ", totPrice=" + totPrice + ", isApproved=" + isApproved + "]";
	}
	
}
