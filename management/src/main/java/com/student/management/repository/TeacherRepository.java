package com.student.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.management.entities.TeacherEntity;

public interface TeacherRepository  extends  CrudRepository<TeacherEntity,Long>{

}
