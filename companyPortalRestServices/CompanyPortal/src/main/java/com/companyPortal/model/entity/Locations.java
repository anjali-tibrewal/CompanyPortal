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
@Table(name = "locations")
@EntityListeners(AuditingEntityListener.class)
public class Locations implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer locationId;
	
	@Column
	private String locationDesc;
	
	@Column
	private Date dtmCreated;
	
	@Column
	private String createdBy;
	
	@Column
	private Date dtmModified;
	
	@Column
	private String modifiedBy;

	/**
	 * @return the locationId
	 */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the locationDesc
	 */
	public String getLocationDesc() {
		return locationDesc;
	}

	/**
	 * @param locationDesc the locationDesc to set
	 */
	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
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

	

	
}
