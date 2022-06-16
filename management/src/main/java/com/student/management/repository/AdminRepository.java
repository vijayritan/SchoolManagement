package com.student.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.management.entities.AdminEntity;

public interface AdminRepository extends  CrudRepository<AdminEntity,Long>{

}
