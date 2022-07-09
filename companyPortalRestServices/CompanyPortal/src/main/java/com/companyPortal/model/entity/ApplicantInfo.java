/**
 * 
 */
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

/**
 * @author atibrewal
 *
 */
@Entity
@Table(name = "applicant_info")
@EntityListeners(AuditingEntityListener.class)
public class ApplicantInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer applicantId;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String gender;
	
	@Column
	private Date dob;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	@Column
	private String addrLine1;
	
	@Column
	private String addrLine2;
	
	@Column
	private String addrState;
	
	@Column 
	private String addrCity;
	
	@Column
	private String addrZip;
	
	@Column
	private String positionApplied;
	
	@Column 
	private Date availableStartDate;
	
	@Column
	private String currentEmploymentStatus;
	
	@Column
	private String currentCtc;
	
	@Column
	private String expectedCtc;
	
	@Column
	private String noticePeriod;
		
	@Column
	private String skills;
	
	@Column
	private String trainings;
	
	@Column
	private String referenceInd;
	
	@Column
	private String reference1FirstName;
	
	@Column
	private String reference1LastName;
	
	@Column
	private String reference1Gender;
	
	@Column
	private Date reference1Dob;
	
	@Column
	private String reference1Email;
	
	@Column 
	private String reference1Phone;
	
	@Column
	private String reference1AddrLine1;
	
	@Column
	private String reference1AddrLine2;
	
	@Column 
	private String reference1AddrState;
	
	@Column
	private String reference1AddrCity;
	
	@Column
	private String reference1AddrZip;
	
	@Column
	private String reference2FirstName;
	
	@Column
	private String reference2LastName;
	
	@Column
	private String reference2Gender;
	
	@Column
	private Date reference2Dob;
	
	@Column
	private String reference2Email;
	
	@Column 
	private String reference2Phone;
	
	@Column
	private String reference2AddrLine1;
	
	@Column
	private String reference2AddrLine2;
	
	@Column 
	private String reference2AddrState;
	
	@Column
	private String reference2AddrCity;
	
	@Column
	private String reference2AddrZip;

	/**
	 * @return the applicantId
	 */
	public Integer getApplicantId() {
		return applicantId;
	}

	/**
	 * @param applicantId the applicantId to set
	 */
	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the addrLine1
	 */
	public String getAddrLine1() {
		return addrLine1;
	}

	/**
	 * @param addrLine1 the addrLine1 to set
	 */
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	/**
	 * @return the addrLine2
	 */
	public String getAddrLine2() {
		return addrLine2;
	}

	/**
	 * @param addrLine2 the addrLine2 to set
	 */
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	/**
	 * @return the addrState
	 */
	public String getAddrState() {
		return addrState;
	}

	/**
	 * @param addrState the addrState to set
	 */
	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}

	/**
	 * @return the addrCity
	 */
	public String getAddrCity() {
		return addrCity;
	}

	/**
	 * @param addrCity the addrCity to set
	 */
	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	/**
	 * @return the addrZip
	 */
	public String getAddrZip() {
		return addrZip;
	}

	/**
	 * @param addrZip the addrZip to set
	 */
	public void setAddrZip(String addrZip) {
		this.addrZip = addrZip;
	}

	/**
	 * @return the positionApplied
	 */
	public String getPositionApplied() {
		return positionApplied;
	}

	/**
	 * @param positionApplied the positionApplied to set
	 */
	public void setPositionApplied(String positionApplied) {
		this.positionApplied = positionApplied;
	}

	/**
	 * @return the availableStartDate
	 */
	public Date getAvailableStartDate() {
		return availableStartDate;
	}

	/**
	 * @param availableStartDate the availableStartDate to set
	 */
	public void setAvailableStartDate(Date availableStartDate) {
		this.availableStartDate = availableStartDate;
	}

	/**
	 * @return the currentEmploymentStatus
	 */
	public String getCurrentEmploymentStatus() {
		return currentEmploymentStatus;
	}

	/**
	 * @param currentEmploymentStatus the currentEmploymentStatus to set
	 */
	public void setCurrentEmploymentStatus(String currentEmploymentStatus) {
		this.currentEmploymentStatus = currentEmploymentStatus;
	}

	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	/**
	 * @return the trainings
	 */
	public String getTrainings() {
		return trainings;
	}

	/**
	 * @param trainings the trainings to set
	 */
	public void setTrainings(String trainings) {
		this.trainings = trainings;
	}

	/**
	 * @return the referenceInd
	 */
	public String getReferenceInd() {
		return referenceInd;
	}

	/**
	 * @param referenceInd the referenceInd to set
	 */
	public void setReferenceInd(String referenceInd) {
		this.referenceInd = referenceInd;
	}

	/**
	 * @return the reference1FirstName
	 */
	public String getReference1FirstName() {
		return reference1FirstName;
	}

	/**
	 * @param reference1FirstName the reference1FirstName to set
	 */
	public void setReference1FirstName(String reference1FirstName) {
		this.reference1FirstName = reference1FirstName;
	}

	/**
	 * @return the reference1LastName
	 */
	public String getReference1LastName() {
		return reference1LastName;
	}

	/**
	 * @param reference1LastName the reference1LastName to set
	 */
	public void setReference1LastName(String reference1LastName) {
		this.reference1LastName = reference1LastName;
	}

	/**
	 * @return the reference1Dob
	 */
	public Date getReference1Dob() {
		return reference1Dob;
	}

	/**
	 * @param reference1Dob the reference1Dob to set
	 */
	public void setReference1Dob(Date reference1Dob) {
		this.reference1Dob = reference1Dob;
	}

	/**
	 * @return the reference1Email
	 */
	public String getReference1Email() {
		return reference1Email;
	}

	/**
	 * @param reference1Email the reference1Email to set
	 */
	public void setReference1Email(String reference1Email) {
		this.reference1Email = reference1Email;
	}

	/**
	 * @return the reference1Phone
	 */
	public String getReference1Phone() {
		return reference1Phone;
	}

	/**
	 * @param reference1Phone the reference1Phone to set
	 */
	public void setReference1Phone(String reference1Phone) {
		this.reference1Phone = reference1Phone;
	}

	/**
	 * @return the reference1AddrLine1
	 */
	public String getReference1AddrLine1() {
		return reference1AddrLine1;
	}

	/**
	 * @param reference1AddrLine1 the reference1AddrLine1 to set
	 */
	public void setReference1AddrLine1(String reference1AddrLine1) {
		this.reference1AddrLine1 = reference1AddrLine1;
	}

	/**
	 * @return the reference1AddrLine2
	 */
	public String getReference1AddrLine2() {
		return reference1AddrLine2;
	}

	/**
	 * @param reference1AddrLine2 the reference1AddrLine2 to set
	 */
	public void setReference1AddrLine2(String reference1AddrLine2) {
		this.reference1AddrLine2 = reference1AddrLine2;
	}

	/**
	 * @return the reference1AddrState
	 */
	public String getReference1AddrState() {
		return reference1AddrState;
	}

	/**
	 * @param reference1AddrState the reference1AddrState to set
	 */
	public void setReference1AddrState(String reference1AddrState) {
		this.reference1AddrState = reference1AddrState;
	}

	/**
	 * @return the reference1AddrCity
	 */
	public String getReference1AddrCity() {
		return reference1AddrCity;
	}

	/**
	 * @param reference1AddrCity the reference1AddrCity to set
	 */
	public void setReference1AddrCity(String reference1AddrCity) {
		this.reference1AddrCity = reference1AddrCity;
	}

	/**
	 * @return the reference1AddrZip
	 */
	public String getReference1AddrZip() {
		return reference1AddrZip;
	}

	/**
	 * @param reference1AddrZip the reference1AddrZip to set
	 */
	public void setReference1AddrZip(String reference1AddrZip) {
		this.reference1AddrZip = reference1AddrZip;
	}

	/**
	 * @return the reference2FirstName
	 */
	public String getReference2FirstName() {
		return reference2FirstName;
	}

	/**
	 * @param reference2FirstName the reference2FirstName to set
	 */
	public void setReference2FirstName(String reference2FirstName) {
		this.reference2FirstName = reference2FirstName;
	}

	/**
	 * @return the reference2LastName
	 */
	public String getReference2LastName() {
		return reference2LastName;
	}

	/**
	 * @param reference2LastName the reference2LastName to set
	 */
	public void setReference2LastName(String reference2LastName) {
		this.reference2LastName = reference2LastName;
	}

	/**
	 * @return the reference2Dob
	 */
	public Date getReference2Dob() {
		return reference2Dob;
	}

	/**
	 * @param reference2Dob the reference2Dob to set
	 */
	public void setReference2Dob(Date reference2Dob) {
		this.reference2Dob = reference2Dob;
	}

	/**
	 * @return the reference2Email
	 */
	public String getReference2Email() {
		return reference2Email;
	}

	/**
	 * @param reference2Email the reference2Email to set
	 */
	public void setReference2Email(String reference2Email) {
		this.reference2Email = reference2Email;
	}

	/**
	 * @return the reference2Phone
	 */
	public String getReference2Phone() {
		return reference2Phone;
	}

	/**
	 * @param reference2Phone the reference2Phone to set
	 */
	public void setReference2Phone(String reference2Phone) {
		this.reference2Phone = reference2Phone;
	}

	/**
	 * @return the reference2AddrLine1
	 */
	public String getReference2AddrLine1() {
		return reference2AddrLine1;
	}

	/**
	 * @param reference2AddrLine1 the reference2AddrLine1 to set
	 */
	public void setReference2AddrLine1(String reference2AddrLine1) {
		this.reference2AddrLine1 = reference2AddrLine1;
	}

	/**
	 * @return the reference2AddrLine2
	 */
	public String getReference2AddrLine2() {
		return reference2AddrLine2;
	}

	/**
	 * @param reference2AddrLine2 the reference2AddrLine2 to set
	 */
	public void setReference2AddrLine2(String reference2AddrLine2) {
		this.reference2AddrLine2 = reference2AddrLine2;
	}

	/**
	 * @return the reference2AddrState
	 */
	public String getReference2AddrState() {
		return reference2AddrState;
	}

	/**
	 * @param reference2AddrState the reference2AddrState to set
	 */
	public void setReference2AddrState(String reference2AddrState) {
		this.reference2AddrState = reference2AddrState;
	}

	/**
	 * @return the reference2AddrCity
	 */
	public String getReference2AddrCity() {
		return reference2AddrCity;
	}

	/**
	 * @param reference2AddrCity the reference2AddrCity to set
	 */
	public void setReference2AddrCity(String reference2AddrCity) {
		this.reference2AddrCity = reference2AddrCity;
	}

	/**
	 * @return the reference2AddrZip
	 */
	public String getReference2AddrZip() {
		return reference2AddrZip;
	}

	/**
	 * @param reference2AddrZip the reference2AddrZip to set
	 */
	public void setReference2AddrZip(String reference2AddrZip) {
		this.reference2AddrZip = reference2AddrZip;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the currentCtc
	 */
	public String getCurrentCtc() {
		return currentCtc;
	}

	/**
	 * @param currentCtc the currentCtc to set
	 */
	public void setCurrentCtc(String currentCtc) {
		this.currentCtc = currentCtc;
	}

	/**
	 * @return the expectedCtc
	 */
	public String getExpectedCtc() {
		return expectedCtc;
	}

	/**
	 * @param expectedCtc the expectedCtc to set
	 */
	public void setExpectedCtc(String expectedCtc) {
		this.expectedCtc = expectedCtc;
	}

	/**
	 * @return the noticePeriod
	 */
	public String getNoticePeriod() {
		return noticePeriod;
	}

	/**
	 * @param noticePeriod the noticePeriod to set
	 */
	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	/**
	 * @return the reference1Gender
	 */
	public String getReference1Gender() {
		return reference1Gender;
	}

	/**
	 * @param reference1Gender the reference1Gender to set
	 */
	public void setReference1Gender(String reference1Gender) {
		this.reference1Gender = reference1Gender;
	}

	/**
	 * @return the reference2Gender
	 */
	public String getReference2Gender() {
		return reference2Gender;
	}

	/**
	 * @param reference2Gender the reference2Gender to set
	 */
	public void setReference2Gender(String reference2Gender) {
		this.reference2Gender = reference2Gender;
	}

}
