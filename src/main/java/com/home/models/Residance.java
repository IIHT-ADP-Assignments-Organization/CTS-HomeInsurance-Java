package com.home.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Residance")
public class Residance {
	
	   @Column(name="quoteId")
	   	String quoteId;
	   
	   @Column(name="residanceType")
       String residanceType;
	   
	   @Column(name="addressLine1")
       String addressLine1;
	  
	   @Column(name="addressLine2")
       String addressLine2;
	   
	   @Column(name="city")
       String city;
	   
	   @Column(name="zip")
	   int zip;

	   @Column(name="residanceUse")
       String residanceUse;
	   
	   @Column(name="userName")
      String userName;
	   
public String getQuoteId() {
	return quoteId;
}
public void setQuoteId(String quoteId) {
	this.quoteId = quoteId;
}
public String getResidanceType() {
	return residanceType;
}
public void setResidanceType(String residanceType) {
	this.residanceType = residanceType;
}
public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getAddressLine2() {
	return addressLine2;
}
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public String getResidanceUse() {
	return residanceUse;
}
public void setResidanceUse(String residanceUse) {
	this.residanceUse = residanceUse;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}

}
