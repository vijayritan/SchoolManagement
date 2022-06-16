package com.student.management.entities;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tution_fees")
public class TutionFeesEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@Column(name="course_fees")
	Map<String,Integer> courseFees;
	
	@Column(name ="course_duration")
	Map<String,Integer> courseDuration;

	public Map<String, Integer> getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(Map<String, Integer> courseFees) {
		this.courseFees = courseFees;
	}

	public Map<String, Integer> getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(Map<String, Integer> courseDuration) {
		this.courseDuration = courseDuration;
	}
	


}
