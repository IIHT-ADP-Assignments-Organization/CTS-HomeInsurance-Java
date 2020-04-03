package com.home.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Quote")

public class Quote {
	
	@Id
	   @Column(name="quoteId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
String quoteId;

	 @Column(name="premium")
String premium;
	 
	 @Column(name="dwelling")
String dwelling;
	 
	 @Column(name="detachedStructure")
String detachedStructure;
	 
	 @Column(name="personalproperty")
String personalproperty;
	 
	 @Column(name="addnLivingProperty")
String addnLivingProperty;
	 
	 @Column(name="medicalExpense")
double medicalExpense;
	 
	 @Column(name="deductable")
double deductable;
	 
	 @Column(name="userId")
long  userId;

public String getQuoteId() {
	return quoteId;
}
public void setQuoteId(String quoteId) {
	this.quoteId = quoteId;
}
public String getPremium() {
	return premium;
}
public void setPremium(String premium) {
	this.premium = premium;
}
public String getDwelling() {
	return dwelling;
}
public void setDwelling(String dwelling) {
	this.dwelling = dwelling;
}
public String getDetachedStructure() {
	return detachedStructure;
}
public void setDetachedStructure(String detachedStructure) {
	this.detachedStructure = detachedStructure;
}
public String getPersonalproperty() {
	return personalproperty;
}
public void setPersonalproperty(String personalproperty) {
	this.personalproperty = personalproperty;
}
public String getAddnLivingProperty() {
	return addnLivingProperty;
}
public void setAddnLivingProperty(String addnLivingProperty) {
	this.addnLivingProperty = addnLivingProperty;
}
public double getMedicalExpense() {
	return medicalExpense;
}
public void setMedicalExpense(double medicalExpense) {
	this.medicalExpense = medicalExpense;
}
public double getDeductable() {
	return deductable;
}
public void setDeductable(double deductable) {
	this.deductable = deductable;
}
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}

}
