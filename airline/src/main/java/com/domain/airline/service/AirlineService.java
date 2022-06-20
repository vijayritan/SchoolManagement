package com.domain.airline.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.airline.entities.AirlineEntity;
import com.domain.airline.repositories.AirlineRepository;


@Service
public class AirlineService {
	
	@Autowired
	AirlineRepository airlineRepo;

	public void saveAirline(AirlineEntity airline) {
		airlineRepo.save(airline);
		
	}

	//fetching active  flights
	public List<AirlineEntity> fetchDetails() {
		
		List<AirlineEntity> airLineEntities  =  (List<AirlineEntity>) airlineRepo.findAll();
		List<AirlineEntity> activeAirLineEntities = airLineEntities.stream().filter(eachAirlineEntity -> eachAirlineEntity.getIsActive()==true).collect(Collectors.toList());
	    return activeAirLineEntities;
	}

	//fetching all active flights
	
	/*
	 * public List<AirlineEntity> activeFlightd() {
	 * 
	 * }
	 */
	

	
	  public void updateAirline(AirlineEntity airline) { 
		  airlineRepo.save(airline);
	  
	  }
	  
     //updating flight status
	public void updateStatus(AirlineEntity airline, Long id) {
		AirlineEntity status = airlineRepo.findById(id).get();
		status.setIsActive(airline.getIsActive());
		airlineRepo.save(status);
		
	}

	
	  //updating fight timings
	public void updateTimings(AirlineEntity airline,
	  Long id) { AirlineEntity timings = airlineRepo.findById(id).get();
	  timings.setFlightTime(airline.getFlightTime()); airlineRepo.save(timings);
	  
	  }
	 

	
	}
	
	
	
	
	
	


