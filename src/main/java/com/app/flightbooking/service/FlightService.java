package com.app.flightbooking.service;

import com.app.flightbooking.entity.Flight;

import java.util.List;

public interface FlightService {
	
	List<Flight> findAll();
	Flight findById(int flightId);
	Flight save(Flight flight);
	void deleteById(int flightId);
	
}
