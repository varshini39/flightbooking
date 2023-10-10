package com.app.flightbooking.rest;

import com.app.flightbooking.entity.Flight;
import com.app.flightbooking.exception.IdNotFoundException;
import com.app.flightbooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightRestController {
	
	private FlightService flightService;
	
	@Autowired
	public FlightRestController(FlightService flightService) {
		this.flightService = flightService;
	}
	
	@GetMapping
	public List<Flight> findAll() {
		return flightService.findAll();
	}
	
	@GetMapping("/{flightId}")
	public Flight getFlight(@PathVariable int flightId) {
		Flight flight = flightService.findById(flightId);
		if(flight == null) {
			throw new IdNotFoundException("Flight ID not found - " + flightId);
		}
		return flight;
	}
	
	@PostMapping
	public Flight addFlight(@RequestBody Flight flight) {
		flight.setFlight_id(0);
		Flight newFlight = flightService.save(flight);
		return newFlight;
	}
	
	@PutMapping
	public Flight updateFlight(@RequestBody Flight flight) {
		Flight newFlight = flightService.save(flight);
		return newFlight;
	}
	
	@DeleteMapping("/{flightId}")
	public String deleteFlight(@PathVariable int flightId) {
		Flight flight = flightService.findById(flightId);
		if(flight == null) {
			throw new IdNotFoundException("Flight ID not found - " + flightId);
		}
		flightService.deleteById(flightId);
		return "Deleted flight ID - " + flightId;
	}
}
