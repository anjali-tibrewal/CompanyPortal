package com.companyPortal.service;

import java.util.List;

import com.companyPortal.model.entity.ApplicantInfo;
import com.companyPortal.model.entity.Jobs;

public interface CompanyPortalService {

	public List<Jobs> searchJobs(Jobs request);

	public List<String> getJobNames();

	public List<String> getLocations();

	public int saveApplicant(ApplicantInfo request);

	public List<Jobs> getJobs();

}
