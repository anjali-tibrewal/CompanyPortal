package com.companyPortal.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.companyPortal.model.entity.ApplicantInfo;
import com.companyPortal.model.entity.Jobs;
import com.companyPortal.service.CompanyPortalService;

@RestController
@RequestMapping
public class CompanyPortalController {

	@Autowired
	CompanyPortalService service;
	
	@CrossOrigin
	@RequestMapping(value = "/searchJobs", method = RequestMethod.POST)
	public List<Jobs> searchJobs(@RequestBody Jobs request){
		return service.searchJobs(request);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getJobNames", method = RequestMethod.GET)
	public List<String> getJobNames(){
		return service.getJobNames();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getLocations", method = RequestMethod.GET)
	public List<String> getLocations(){
		return service.getLocations();
	}
	
	
	@CrossOrigin
	@RequestMapping(value = "/saveApplicant", method = RequestMethod.POST)
	public int saveApplicant(@RequestBody ApplicantInfo request){
		return service.saveApplicant(request);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getJobs", method = RequestMethod.GET)
	public List<Jobs> getJobs(){
		return service.getJobs();
	}
	
}
