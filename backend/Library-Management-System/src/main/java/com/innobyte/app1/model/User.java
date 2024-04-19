package com.innobyte.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserRegistration_details")
public class User {
	@Id
	@GeneratedValue
	private Integer UserId;
	private String firstName;
	private String lastName;
	private String gender;
	private String address;
	private Long mobileNumber;
	private String email;
	private String password;
	public User() {
		super();
	}
	public User(Integer userId, String firstName, String lastName, String gender, String address,
			Long mobileNumber, String email, String password) {
		super();
		UserId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRegistration [UserId=" + UserId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", address=" + address + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	

}
