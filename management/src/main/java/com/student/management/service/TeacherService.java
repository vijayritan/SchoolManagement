package com.student.management.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entities.TeacherEntity;
import com.student.management.repository.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	TeacherRepository teacherRepository;

	public void saveTeacher(TeacherEntity teacher) {
		List<String> subjectNames  = teacher.getSubjectNames();
		//only if the teacher knows the subject - Maths -only then save the teacher
		boolean eligible = false;
		long count = subjectNames.stream().filter(eachSubject -> eachSubject.equals("Maths")).count();
		if(count>1) {
			eligible = true;
		}
		if(eligible) {
		teacherRepository.save(teacher);
		} else {
			System.out.println("Teacher is not eligible");
		}
	}

}
