package com.student.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entities.AdminEntity;
import com.student.management.entities.StudentEntity;
import com.student.management.repository.AdminRepository;
import com.student.management.repository.StudentRepository;

@Service
public class AdminService {
    
	@Autowired
	AdminRepository adminRepo;
	/*
	 * public void saveAdminHead(AdminEntity adminHead) { Integer adminMemebersCount
	 * = adminHead.setAdminHead(null);
	 * 
	 * 
	 * }
	 * 
	 * public void updateAdmin(AdminEntity adminHead) { adminRepo.save(adminHead); }
	 * 
	 * public List<AdminEntity> fetchAdmins() { return (List<AdminEntity>)
	 * adminRepo.findAll(); }
	 */

}
