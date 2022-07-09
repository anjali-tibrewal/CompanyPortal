package com.companyPortal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyPortal.dao.CompanyPortalDao;
import com.companyPortal.model.entity.ApplicantInfo;
import com.companyPortal.model.entity.Jobs;
import com.companyPortal.utils.StringUtils;

@Service("CompanyPortalService")
public class CompanyPortalServiceImpl implements CompanyPortalService{

	@Autowired
	CompanyPortalDao dao;
	
	@Override
	public List<Jobs> searchJobs(Jobs request) {
		List<Jobs> jobs = new ArrayList<>();
		if(request != null){
			if(!StringUtils.isEmpty(request.getJobDesc()) && !StringUtils.isEmpty(request.getJobLocation())){
				jobs = dao.getJobsBasedOnDescAndLocation(request);
			}
			else if(!StringUtils.isEmpty(request.getJobDesc()) && StringUtils.isEmpty(request.getJobLocation())){
				jobs = dao.getJobsBasedOnDesc(request);
			}else if(StringUtils.isEmpty(request.getJobDesc()) && !StringUtils.isEmpty(request.getJobLocation())){
				jobs = dao.getJobsBasedOnLocation(request);
			}
		}
		return jobs;
	}

	@Override
	public List<String> getJobNames() {
		return dao.getJobNames();
	}

	@Override
	public List<String> getLocations() {
		return dao.getLocations();
	}

	@Override
	public int saveApplicant(ApplicantInfo request) {
		return dao.saveApplicant(request);
	}

	@Override
	public List<Jobs> getJobs() {
		return dao.getJobs();
	}

}
