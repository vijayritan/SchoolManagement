package com.student.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.management.entities.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity,Long>{
	//CrudRepository - crud operations
	//PagingAndSortingRepository - paging and sorting
	//JPARepository - crud+paging

}
