package com.student.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entities.StudentEntity;
import com.student.management.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepo;
	
	public void saveStudent(StudentEntity student) {
		Integer totalMarks = calculateTotalMarks(student);
		student.setTotalMarks(totalMarks);
		String grade =  calculateGrade(totalMarks);
		student.setGrade(grade);
		boolean promoted = checkPromoted(grade);
		student.setPromoted(promoted);
		studentRepo.save(student);
	}
	
	private boolean checkPromoted(String grade) {
		if(grade.equals("A") || grade.equals("B")) {
		return true;
		} else {
			return false;
		}
	}


	private String calculateGrade(Integer totalMarks) {
//		switch(totalMarks) {
//		case 200:
//		case 250: 
//			return "A";
//		case 150: 
//			return "B";
//
//		case 100:
//			return "C";
//		default :
//			return "No grade";
//		}
		
		if(totalMarks>200) {
			return "A";
		} else if(totalMarks > 150 && totalMarks <200) {
			return "B";
		} else  {
			return "C";
		}
	}


	private Integer calculateTotalMarks(StudentEntity student) {
		Integer totalMarks = 0;
		totalMarks = student.getEnglishMarks()+student.getHindiMarks()+student.getSanskritMarks();
		return totalMarks;
	}

	public List<StudentEntity> fetchStudents() {
		return (List<StudentEntity>) studentRepo.findAll();	
	}

	public void updateStudent(StudentEntity student) {
		studentRepo.save(student);
	}

	public void updateStudentPatch(StudentEntity student, Long id) {
		StudentEntity std = studentRepo.findById(id).get();
		std.setRollNumber(student.getRollNumber());
		studentRepo.save(std);
	}

	public void deleteStudent(StudentEntity student) {
		studentRepo.delete(student);
		
	}
	
    
	
}
