package com.home.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Policy")
public class Policy {
	@Id
	   @Column(name="policyKey")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
  String policyKey;
	
	@Column(name="quoteId")
String quoteId;
	
	@Column(name="policyEffectiveDate")
 Date policyEffectiveDate;
	
	@Column(name="PolicyEndDate")
Date PolicyEndDate;
	
	@Column(name="policyTermPeriod")
String policyTermPeriod;
	
	@Column(name="policyTerm")
String policyTerm;
	
public String getPolicyKey() {
	return policyKey;
}
public void setPolicyKey(String policyKey) {
	this.policyKey = policyKey;
}
public String getQuoteId() {
	return quoteId;
}
public void setQuoteId(String quoteId) {
	this.quoteId = quoteId;
}
public Date getPolicyEffectiveDate() {
	return policyEffectiveDate;
}
public void setPolicyEffectiveDate(Date policyEffectiveDate) {
	this.policyEffectiveDate = policyEffectiveDate;
}
public Date getPolicyEndDate() {
	return PolicyEndDate;
}
public void setPolicyEndDate(Date policyEndDate) {
	PolicyEndDate = policyEndDate;
}
public String getPolicyTermPeriod() {
	return policyTermPeriod;
}
public void setPolicyTermPeriod(String policyTermPeriod) {
	this.policyTermPeriod = policyTermPeriod;
}
public String getPolicyTerm() {
	return policyTerm;
}
public void setPolicyTerm(String policyTerm) {
	this.policyTerm = policyTerm;
}


}
