package com.companyPortal.model.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "jobs")
@EntityListeners(AuditingEntityListener.class)
public class Jobs implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobId;
	
	@Column
	private String jobDesc;
	
	@Column
	private String jobLocation;
	
	@Column
	private String salaryOffered;
	
	@Column
	private Date postedDate;
	
	@Column
	private String minExperience;
	
	@Column
	private Date dtmCreated;
	
	@Column
	private String createdBy;
	
	@Column
	private Date dtmModified;
	
	@Column
	private String modifiedBy;
	
	@Column
	private String jobType;
	
	@Column
	private String companyName;
	/**
	 * @return the jobId
	 */
	public int getJobId() {
		return jobId;
	}

	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	/**
	 * @return the jobDesc
	 */
	public String getJobDesc() {
		return jobDesc;
	}

	/**
	 * @param jobDesc the jobDesc to set
	 */
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	/**
	 * @return the jobLocation
	 */
	public String getJobLocation() {
		return jobLocation;
	}

	/**
	 * @param jobLocation the jobLocation to set
	 */
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	/**
	 * @return the salaryOffered
	 */
	public String getSalaryOffered() {
		return salaryOffered;
	}

	/**
	 * @param salaryOffered the salaryOffered to set
	 */
	public void setSalaryOffered(String salaryOffered) {
		this.salaryOffered = salaryOffered;
	}

	/**
	 * @return the postedDate
	 */
	public Date getPostedDate() {
		return postedDate;
	}

	/**
	 * @param postedDate the postedDate to set
	 */
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	/**
	 * @return the minExperience
	 */
	public String getMinExperience() {
		return minExperience;
	}

	/**
	 * @param minExperience the minExperience to set
	 */
	public void setMinExperience(String minExperience) {
		this.minExperience = minExperience;
	}

	/**
	 * @return the dtmCreated
	 */
	public Date getDtmCreated() {
		return dtmCreated;
	}

	/**
	 * @param dtmCreated the dtmCreated to set
	 */
	public void setDtmCreated(Date dtmCreated) {
		this.dtmCreated = dtmCreated;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the dtmModified
	 */
	public Date getDtmModified() {
		return dtmModified;
	}

	/**
	 * @param dtmModified the dtmModified to set
	 */
	public void setDtmModified(Date dtmModified) {
		this.dtmModified = dtmModified;
	}

	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the jobType
	 */
	public String getJobType() {
		return jobType;
	}

	/**
	 * @param jobType the jobType to set
	 */
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	
}
