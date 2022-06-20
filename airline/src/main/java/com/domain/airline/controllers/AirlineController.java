package com.domain.airline.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.airline.entities.AirlineEntity;
import com.domain.airline.service.AirlineService;

@RestController
@RequestMapping("/airlines")
public class AirlineController {

	@Autowired
	AirlineService airlineService;

	@GetMapping("/welcome-message")
	public String welcomeMessage() {
		System.out.println("Welcome msg");
		return "Welcome to Airlines";
	}

	@PostMapping("/create_airline")
	public void createAirline(@RequestBody AirlineEntity airline) {
		airlineService.saveAirline(airline);

	}

	@GetMapping("/fetch_details")
	public List<AirlineEntity> fetchDeatails() {
		return airlineService.fetchDetails();
	}

	/*
	 * @PutMapping("update_airline") public void updateAirline(@RequestBody
	 * AirlineEntity airline) { airlineService.updateAirline(airline); }
	 */

	@PatchMapping("/update_status/{id}")
	public void updateStatus(@RequestBody AirlineEntity airline, @PathVariable Long id) {
		airlineService.updateStatus(airline, id);
	}
	 
	  @PatchMapping("/update-timings/{id}") public void
	  updateFightTimings(@RequestBody AirlineEntity airline,@PathVariable Long id)
	  { airlineService.updateTimings(airline,id); }
	  
	 
}
