package com.domain.airline.repositories;

import org.springframework.data.repository.CrudRepository;

import com.domain.airline.entities.AirlineEntity;

public interface AirlineRepository extends CrudRepository<AirlineEntity, Long> {
	

	
}
