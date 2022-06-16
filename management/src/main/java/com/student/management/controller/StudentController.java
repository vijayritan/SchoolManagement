package com.student.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.entities.StudentEntity;
import com.student.management.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	public String notificationMsg() {
		System.out.println("welcome msg");
		return "Hello Students Welcome!!!";
	}

	@GetMapping("/welcome-message")
	public String welcomeMessage() {
		System.out.println("welcome msg");
		return "Hello Students";
	}
	
	@GetMapping("/testing")
	public String testing() {
		System.out.println("welcome msg");
		return "Hello testing";
	}
	
	
	@PostMapping("/create-student")
	public void createStudent(@RequestBody StudentEntity student) {
		studentService.saveStudent(student);
	}
	
	@GetMapping("/fetch-students") 
	public List<StudentEntity> fetchStudents() {
		System.out.print("fetch students{}");
		return studentService.fetchStudents();
	}
	
	@PutMapping("/update-student")
	public void updateStudent(@RequestBody StudentEntity student) {
		studentService.updateStudent(student);
	}
	
	@PatchMapping("/update-student-patch/{id}")
	public void updateStudentPatch(@RequestBody StudentEntity student,@PathVariable Long id) {
		studentService.updateStudentPatch(student,id);
	}
	
	
	@DeleteMapping("delete-student")
	public void deleteStudent(@RequestBody StudentEntity student) {
			studentService.deleteStudent(student);
	}
}
