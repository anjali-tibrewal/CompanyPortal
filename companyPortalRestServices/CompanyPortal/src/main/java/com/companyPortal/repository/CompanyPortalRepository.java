package com.companyPortal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.companyPortal.model.entity.Jobs;


public interface CompanyPortalRepository extends JpaRepository<Jobs, Integer> {
	
	List<Jobs> findAll();
}
