package com.vnps.domain.usermanagement;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="ROLE")
public class Role {
	
	@Id
	@GeneratedValue
	@Column (name="ROLE_ID")
	private int roleId;
	
	@Column (name="ROLE_DESC")
	private String roleDescription;
	
	@Column (name="CREATED_BY")
	@ManyToOne
	private User createdBy;
	
	@Column (name="CREATE_DT")
	private Date createDate;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
