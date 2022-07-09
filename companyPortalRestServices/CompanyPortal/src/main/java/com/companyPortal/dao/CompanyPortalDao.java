package com.companyPortal.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.companyPortal.model.entity.ApplicantInfo;
import com.companyPortal.model.entity.Jobs;
import com.companyPortal.utils.StringUtils;

@Repository
@Transactional
public class CompanyPortalDao {

	
	private final String SELECT_JOBS = "SELECT * FROM JOBS";
	
	private final String SELECT_JOB_NAMES = "SELECT job_desc FROM JOBS";
	
	private final String FIND_LOCATION_DESC_FROM_ID = "SELECT location_desc FROM LOCATIONS WHERE location_id = :locationId";
	 
	private final String SELECT_LOCATION_NAMES = "SELECT location_desc FROM LOCATIONS";
	
	private final String FETCH_JOB_BASED_ON_DESC_AND_LOCATION = "SELECT * FROM JOBS WHERE job_desc = :jobDesc AND job_location = :jobLocation";
	
	private final String FETCH_JOB_BASED_ON_DESC = "SELECT * FROM JOBS WHERE job_desc = :jobDesc";

	private final String FETCH_JOB_BASED_ON_LOCATION = "SELECT * FROM JOBS WHERE job_location = :jobLocation";
	
	private final String FIND_LOCATION_ID_FROM_DESC = "SELECT location_id FROM LOCATIONS WHERE location_desc like :locationDesc";

	private final String INSERT_APPLICANT_DATA = "INSERT INTO APPLICANT_INFO (first_name , last_name , gender , DOB , email"
			+ ", position_applied , available_start_date , current_employment_status , current_ctc , expected_ctc "
			+ ", notice_period , skills , trainings , reference_ind) VALUES (:first_name ,:last_name ,"
			+ ":gender ,:DOB ,:email, :position_applied ,:available_start_date ,:current_employment_status ,:current_ctc ,"
			+ ":expected_ctc ,:notice_period ,:skills ,:trainings ,:reference_ind)";
	
	private final String INSERT_APPLICANT_REFERENCES = "INSERT INTO applicant_refrences (applicant_id , reference_firstName"
			+ " , reference_lastName , reference_gender , reference_dob, reference_email ,"
			+ " reference_phone , reference_addr_line1 , reference_addr_line2 , reference_addr_state"
			+ " , reference_addr_city , reference_addr_zip) VALUES (:applicant_id, :reference_firstName, "
			+ ":reference_lastName, :reference_gender, :reference_dob, :reference_email, "
			+ ":reference_phone, :reference_addr_line1 , :reference_addr_line2 , :reference_addr_state , "
			+ ":reference_addr_city , :reference_addr_zip)";
	
	private final String INSERT_APPLICANT_CONTACT = "INSERT INTO APPLICANT_CONTACT (applicant_id ,email ,phone ,addr_line1 ,"
			+ "addr_line2 ,addr_state ,addr_city ,addr_zip) VALUES (:applicant_id ,:email ,:phone ,"
			+ ":addr_line1 ,:addr_line2 ,:addr_state ,:addr_city ,:addr_zip)";
	
	private final String FIND_APPLICANT_ID_BY_EMAIL = "SELECT applicant_id FROM APPLICANT_INFO WHERE email = :email";
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public List<Jobs> getJobs() {
		List<Jobs> jobs = new ArrayList<>();
		SqlParameterSource param = new MapSqlParameterSource();
		List<Map<String, Object>> results = namedParameterJdbcTemplate.queryForList(SELECT_JOBS, param);
		if(!CollectionUtils.isEmpty(results)) {
			for(Map<String, Object> result:results) {
				Jobs job = new Jobs();
				job.setJobId((int) result.get("job_id"));
				job.setJobDesc(result.get("job_desc").toString());
				job.setJobLocation(findLocationDescFromId((int)result.get("job_location")));
				job.setMinExperience(result.get("min_experience").toString());
				job.setPostedDate((Date) result.get("posted_date"));
				job.setSalaryOffered(result.get("offered_salary").toString());
				job.setJobType(result.get("job_type").toString());
				job.setCompanyName(result.get("company_name").toString());
				
				jobs.add(job);
				
			}
		}
		return jobs;
	}
	
	public List<String> getJobNames(){
		SqlParameterSource param = new MapSqlParameterSource();
		List<String> jobNames = namedParameterJdbcTemplate.queryForList(SELECT_JOB_NAMES, param, String.class);
		if(!CollectionUtils.isEmpty(jobNames)){
			return jobNames;
		}
		return null;
	}
	
	public List<String> getLocations(){
		SqlParameterSource param = new MapSqlParameterSource();
		List<String> locations = namedParameterJdbcTemplate.queryForList(SELECT_LOCATION_NAMES, param, String.class);
		if(!CollectionUtils.isEmpty(locations)){
			return locations;
		}
		return null;
	}
	
	public String findLocationDescFromId(int locationId){
		SqlParameterSource param = new MapSqlParameterSource().addValue("locationId", locationId);
		return namedParameterJdbcTemplate.queryForObject(FIND_LOCATION_DESC_FROM_ID, param, String.class);
	}
	
	public int findLocationIdFromDesc(String locationDesc){
		SqlParameterSource param = new MapSqlParameterSource().addValue("locationDesc", locationDesc);
		return namedParameterJdbcTemplate.queryForObject(FIND_LOCATION_ID_FROM_DESC, param, Integer.class);
	}

	public List<Jobs> getJobsBasedOnDescAndLocation(Jobs request) {
		List<Jobs> jobs = new ArrayList<>();
		int locationId = findLocationIdFromDesc(request.getJobLocation());
		SqlParameterSource param = new MapSqlParameterSource().addValue("jobDesc", request.getJobDesc()).addValue("jobLocation", locationId);
		List<Map<String, Object>> results = namedParameterJdbcTemplate.queryForList(FETCH_JOB_BASED_ON_DESC_AND_LOCATION, param);
		if(!CollectionUtils.isEmpty(results)) {
			for(Map<String, Object> result:results) {
				Jobs job = new Jobs();
				job.setJobId((int) result.get("job_id"));
				job.setJobDesc(request.getJobDesc());
				job.setJobLocation(request.getJobLocation());
				job.setMinExperience(result.get("min_experience").toString());
				job.setPostedDate((Date) result.get("posted_date"));
				job.setSalaryOffered(result.get("offered_salary").toString());
				
				jobs.add(job);
				
			}
		}
		return jobs;
	}
	
	public List<Jobs> getJobsBasedOnLocation(Jobs request) {
		List<Jobs> jobs = new ArrayList<>();
		int locationId = findLocationIdFromDesc(request.getJobLocation());
		SqlParameterSource param = new MapSqlParameterSource().addValue("jobLocation", locationId);
		List<Map<String, Object>> results = namedParameterJdbcTemplate.queryForList(FETCH_JOB_BASED_ON_LOCATION, param);
		if(!CollectionUtils.isEmpty(results)) {
			for(Map<String, Object> result:results) {
				Jobs job = new Jobs();
				job.setJobId((int) result.get("job_id"));
				job.setJobDesc(result.get("job_desc").toString());
				job.setJobLocation(request.getJobLocation());
				job.setMinExperience(result.get("min_experience").toString());
				job.setPostedDate((Date) result.get("posted_date"));
				job.setSalaryOffered(result.get("offered_salary").toString());
				
				jobs.add(job);
				
			}
		}
		return jobs;
	}
	
	public List<Jobs> getJobsBasedOnDesc(Jobs request) {
		List<Jobs> jobs = new ArrayList<>();
		SqlParameterSource param = new MapSqlParameterSource().addValue("jobDesc", request.getJobDesc());
		List<Map<String, Object>> results = namedParameterJdbcTemplate.queryForList(FETCH_JOB_BASED_ON_DESC, param);
		if(!CollectionUtils.isEmpty(results)) {
			for(Map<String, Object> result:results) {
				Jobs job = new Jobs();
				job.setJobId((int) result.get("job_id"));
				job.setJobDesc(request.getJobDesc());
				job.setJobLocation(findLocationDescFromId((int)result.get("job_location")));
				job.setMinExperience(result.get("min_experience").toString());
				job.setPostedDate((Date) result.get("posted_date"));
				job.setSalaryOffered(result.get("offered_salary").toString());
				
				jobs.add(job);
				
			}
		}
		return jobs;
	}

	public int saveApplicant(ApplicantInfo request){
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("first_name", request.getFirstName()).addValue("last_name", request.getLastName())
				.addValue("gender", request.getGender()).addValue("DOB", request.getDob()).addValue("email", request.getEmail())
				.addValue("position_applied", request.getPositionApplied()).addValue("available_start_date", request.getAvailableStartDate())
				.addValue("current_employment_status", request.getCurrentEmploymentStatus()).addValue("current_ctc", request.getCurrentCtc())
				.addValue("expected_ctc", request.getExpectedCtc()).addValue("notice_period", request.getNoticePeriod())
				.addValue("skills", request.getSkills()).addValue("trainings", request.getTrainings())
				.addValue("reference_ind", request.getReferenceInd());
		 Integer results = namedParameterJdbcTemplate.update(INSERT_APPLICANT_DATA, param);
		 
		 if(results != null){
			 SqlParameterSource emailParam = new MapSqlParameterSource().addValue("email", request.getEmail());
			 int applicantId = namedParameterJdbcTemplate.queryForObject(FIND_APPLICANT_ID_BY_EMAIL, emailParam, Integer.class);
			 
			 
			 SqlParameterSource contactParam = new MapSqlParameterSource().addValue("applicant_id", applicantId)
					 .addValue("email", request.getEmail()).addValue("phone", request.getPhone())
					 .addValue("addr_line1", request.getAddrLine1()).addValue("addr_line2", request.getAddrLine2())
					 .addValue("addr_state", request.getAddrState()).addValue("addr_city", request.getAddrCity())
					 .addValue("addr_zip",request.getAddrZip());
			 Integer contactResults = namedParameterJdbcTemplate.update(INSERT_APPLICANT_CONTACT, contactParam);
			 
			 
			 if(!StringUtils.isEmpty(request.getReference1FirstName())){
				 insertFirstReferences(request, applicantId);
			 }
			 
			 if(!StringUtils.isEmpty(request.getReference2FirstName())){
				 insertSecondReferences(request, applicantId);
			 }
		 }
		 
		
		return results.intValue();
	}

	private int insertFirstReferences(ApplicantInfo request, int applicantId) {
		SqlParameterSource referenceParam = new MapSqlParameterSource().addValue("applicant_id", applicantId)
				 .addValue("reference_firstName", request.getReference1FirstName()).addValue("reference_lastName", request.getReference1LastName())
				 .addValue("reference_gender", request.getReference1Gender()).addValue("reference_dob", request.getReference1Dob())
				 .addValue("reference_email", request.getReference1Email()).addValue("reference_phone", request.getReference1Phone())
				 .addValue("reference_addr_line1", request.getReference1AddrLine1()).addValue("reference_addr_line2", request.getReference1AddrLine2())
				 .addValue("reference_addr_state", request.getReference1AddrState()).addValue("reference_addr_city", request.getReference1AddrCity())
				 .addValue("reference_addr_zip", request.getReference1AddrZip());
		 
		 Integer referenceResults = namedParameterJdbcTemplate.update(INSERT_APPLICANT_REFERENCES, referenceParam);
		 return referenceResults;
	}
	
	private int insertSecondReferences(ApplicantInfo request, int applicantId) {
		SqlParameterSource referenceParam = new MapSqlParameterSource().addValue("applicant_id", applicantId)
				 .addValue("reference_firstName", request.getReference2FirstName()).addValue("reference_lastName", request.getReference2LastName())
				 .addValue("reference_gender", request.getReference2Gender()).addValue("reference_dob", request.getReference2Dob())
				 .addValue("reference_email", request.getReference2Email()).addValue("reference_phone", request.getReference2Phone())
				 .addValue("reference_addr_line1", request.getReference2AddrLine1()).addValue("reference_addr_line2", request.getReference2AddrLine2())
				 .addValue("reference_addr_state", request.getReference2AddrState()).addValue("reference_addr_city", request.getReference2AddrCity())
				 .addValue("reference_addr_zip", request.getReference2AddrZip());
		 
		 Integer referenceResults = namedParameterJdbcTemplate.update(INSERT_APPLICANT_REFERENCES, referenceParam);
		 return referenceResults;
	}
}
