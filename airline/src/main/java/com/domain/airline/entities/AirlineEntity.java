package com.domain.airline.entities;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "airline")
public class AirlineEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@Column(name = "airline_name")
	String airlineName;
	
	@Column(name = "flight_name")
	String flightName;
	
	@Column(name = "flight_timings")
	LocalDateTime flightTime;
	
	@Column(name = "created_date")
	LocalDate createdDate;
	
	
	@Column(name = "updated_date")
	LocalDate updatedDate;
	
	@Column(name = "is_active")
	Boolean isActive;
	
	

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public LocalDateTime getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(LocalDateTime flightTime) {
		this.flightTime = flightTime;
	}
	
	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	

}
