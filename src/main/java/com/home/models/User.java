package com.home.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="User")
public class User {
	
	@Id
	   @Column(name="userId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
		long userId;
	
	 @Column(name="firstName")
String firstName;
	 
	 @Column(name="LastName")
String LastName;
	 
	 @Column(name="userName")
String userName;
	 
	 @Column(name="dateOfBirth")
Date dateOfBirth;
	 
	 @Column(name="isRetired")
boolean isRetired;
	 
	 @Column(name="isValid")
boolean isValid;
	 
	 @Column(name="ssn")
int ssn;
String userType;
String password;
String email;
int phoneNumber;
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public boolean isRetired() {
	return isRetired;
}
public void setRetired(boolean isRetired) {
	this.isRetired = isRetired;
}
public boolean isValid() {
	return isValid;
}
public void setValid(boolean isValid) {
	this.isValid = isValid;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}

}
