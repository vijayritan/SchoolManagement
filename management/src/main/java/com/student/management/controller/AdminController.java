package com.student.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.entities.AdminEntity;
import com.student.management.service.AdminService;

@RestController
@RequestMapping
public class AdminController {
	
	/*
	 * @Autowired AdminService adminService;
	 * 
	 * @PostMapping public void createAdmin(@RequestBody AdminEntity adminHead) {
	 * adminService.saveAdminHead(adminHead); }
	 */
}
