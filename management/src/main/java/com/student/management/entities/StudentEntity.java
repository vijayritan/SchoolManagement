package com.student.management.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@Column(name ="student_name")
	String name;
	
	@Column(name = "roll_number")
	String rollNumber;
	
	@Column(name ="english_marks")
	Integer englishMarks;
	
	
	@Column(name ="hindi_marks")
	Integer hindiMarks;
	
	@Column(name ="sanskrit_marks")
	Integer sanskritMarks;

	@Column(name ="total_marks")
	Integer totalMarks;
	
	
	@Column(name = "grade")
	String grade;
	
	@Column(name="promoted")
	boolean promoted;
	
	public boolean isPromoted() {
		return promoted;
	}

	public void setPromoted(boolean promoted) {
		this.promoted = promoted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Integer getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(Integer englishMarks) {
		this.englishMarks = englishMarks;
	}

	public Integer getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(Integer hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public Integer getSanskritMarks() {
		return sanskritMarks;
	}

	public void setSanskritMarks(Integer sanskritMarks) {
		this.sanskritMarks = sanskritMarks;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
}
