package com.vnps.domain.usermanagement;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table (name="USER_TYPE")
public class UserType {

	@Id
	@Column (name="TYPE_ID")
	private long typeId;
	
	@Column (name="TYPE_DESC")
	private String typeDescription;
	
	@Column (name="CREATE_DT")
	private Date createdDate;
	
	@Column (name="CREATED_BY")
	@ManyToOne
	private User createdBy;

	public long getTypeId() {
		return typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
}
