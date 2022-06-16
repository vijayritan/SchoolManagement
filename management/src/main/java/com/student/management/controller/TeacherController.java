package com.student.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.entities.StudentEntity;
import com.student.management.entities.TeacherEntity;
import com.student.management.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@PostMapping("/create-teacher")
	public void createTeacher(@RequestBody TeacherEntity teacher) {
		teacherService.saveTeacher(teacher);
	}
}
