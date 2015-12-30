package com.vnps.domain.usermanagement;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name="USER")
public class User {
	
	@Id
	@Column (name="USER_ID")
	private long userId;
	
	@Embedded
	private Name userName;
	
	@Embedded
	@AttributeOverrides ({
			@AttributeOverride (name = "address1",
				column=@Column(name="HOME_ADDRESS1")
			),
			@AttributeOverride (name="address2",
				column=@Column(name="HOME_ADDRESS2")
			),
			@AttributeOverride (name="city",
				column=@Column(name="HOME_CITY")
			),
			@AttributeOverride (name="state",
				column=@Column(name="HOME_STATE")
			),
			@AttributeOverride (name="zipCode",
			 column=@Column(name="HOME_ZIPCODE")
			)}
			
	)
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides ({
		@AttributeOverride (name = "address1",
			column=@Column(name="MAIL_ADDRESS1")
		),
		@AttributeOverride (name="address2",
			column=@Column(name="MAIL_ADDRESS2")
		),
		@AttributeOverride (name="city",
			column=@Column(name="MAIL_CITY")
		),
		@AttributeOverride (name="state",
			column=@Column(name="MAIL_STATE")
		),
		@AttributeOverride (name="zipCode",
		 column=@Column(name="MAIL_ZIPCODE")
		)}
	)	
	private Address mailingAddress;
	
	@Column (name="BIRTH_DT")
	private Date dateOfBirth;
	
	@Column (name="GENDER")
	private String gender;
	
	@Column (name="PH_HOME")
	private String homePhone;
	
	@Column (name="PH_WORK")
	private String workPhone;
	
	@Column (name="PH_MOBILE")
	private String mobilePhone;

	@OneToMany (fetch=FetchType.LAZY)
	@JoinTable (name="USER_TYPES",
				joinColumns=@JoinColumn(name="USER_ID"),
				inverseJoinColumns=@JoinColumn(name="TYPE_ID"))
	private List<UserType> userTypes;
	
	@OneToMany (fetch=FetchType.LAZY)
	@JoinTable (name="USER_ROLES",
				joinColumns=@JoinColumn(name="USER_ID"),
				inverseJoinColumns=@JoinColumn(name="ROLE_ID"))
	private List<Role> roles;
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Name getUserName() {
		return userName;
	}

	public void setUserName(Name userName) {
		this.userName = userName;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address address) {
		this.homeAddress = address;
	}

	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public List<UserType> getUserTypes() {
		return userTypes;
	}

	public void setUserTypes(List<UserType> userTypes) {
		this.userTypes = userTypes;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
