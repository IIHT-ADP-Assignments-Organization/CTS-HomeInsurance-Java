package com.home.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Property")

public class Property {
	
	@Id
	   @Column(name="propertyId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
		long propertyId;
	
	@Column(name="quoteId")	
String quoteId;
	
	@Column(name="UserId")
long UserId;
	
	@Column(name="marketValue")
double marketValue;
	
	@Column(name="yearBuild")
int yearBuild;
	
	@Column(name="squareFootValue")
String squareFootValue;
	
	@Column(name="dwellingStyle")
String dwellingStyle;
	
	@Column(name="roofMaterial")
String roofMaterial;
	
	@Column(name="garageType")
String garageType;
	
	@Column(name="numfullBaths")
int numfullBaths;
	
	@Column(name="numhalfBaths")
int numhalfBaths;
	
	@Column(name="hasSwimmingPool")
boolean hasSwimmingPool;
	
public long getPropertyId() {
	return propertyId;
}
public void setPropertyId(long propertyId) {
	this.propertyId = propertyId;
}
public String getQuoteId() {
	return quoteId;
}
public void setQuoteId(String quoteId) {
	this.quoteId = quoteId;
}
public long getUserId() {
	return UserId;
}
public void setUserId(long userId) {
	UserId = userId;
}
public double getMarketValue() {
	return marketValue;
}
public void setMarketValue(double marketValue) {
	this.marketValue = marketValue;
}
public int getYearBuild() {
	return yearBuild;
}
public void setYearBuild(int yearBuild) {
	this.yearBuild = yearBuild;
}
public String getSquareFootValue() {
	return squareFootValue;
}
public void setSquareFootValue(String squareFootValue) {
	this.squareFootValue = squareFootValue;
}
public String getDwellingStyle() {
	return dwellingStyle;
}
public void setDwellingStyle(String dwellingStyle) {
	this.dwellingStyle = dwellingStyle;
}
public String getRoofMaterial() {
	return roofMaterial;
}
public void setRoofMaterial(String roofMaterial) {
	this.roofMaterial = roofMaterial;
}
public String getGarageType() {
	return garageType;
}
public void setGarageType(String garageType) {
	this.garageType = garageType;
}
public int getNumfullBaths() {
	return numfullBaths;
}
public void setNumfullBaths(int numfullBaths) {
	this.numfullBaths = numfullBaths;
}
public int getNumhalfBaths() {
	return numhalfBaths;
}
public void setNumhalfBaths(int numhalfBaths) {
	this.numhalfBaths = numhalfBaths;
}
public boolean isHasSwimmingPool() {
	return hasSwimmingPool;
}
public void setHasSwimmingPool(boolean hasSwimmingPool) {
	this.hasSwimmingPool = hasSwimmingPool;
}

}
