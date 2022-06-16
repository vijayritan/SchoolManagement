package com.student.management.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class AdminEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@Column(name="admin_head")
	String adminHead;
	
	@Column(name="admin_members_count")
	String adminMemebersCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdminHead() {
		return adminHead;
	}

	public void setAdminHead(String adminHead) {
		this.adminHead = adminHead;
	}

	public String getAdminMemebersCount() {
		return adminMemebersCount;
	}

	public void setAdminMemebersCount(String adminMemebersCount) {
		this.adminMemebersCount = adminMemebersCount;
	}
	
	
}
