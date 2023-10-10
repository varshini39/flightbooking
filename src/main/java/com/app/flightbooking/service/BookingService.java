package com.app.flightbooking.service;

import com.app.flightbooking.entity.Booking;

import java.util.List;

public interface BookingService {
	
	List<Booking> findAll();
	Booking findById(int bookingId);
	Booking save(Booking booking);
	void deleteById(int bookingId);
	
}
