package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int makanNo;
 private String street;
 private String Area;
 private String City;
 private int PinCode;
 private String State;
 private String country;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int makanNo, String street, String area, String city, int pinCode, String state, String country) {
	super();
	this.makanNo = makanNo;
	this.street = street;
	Area = area;
	City = city;
	PinCode = pinCode;
	State = state;
	this.country = country;
}
public int getMakanNo() {
	return makanNo;
}
public void setMakanNo(int makanNo) {
	this.makanNo = makanNo;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getArea() {
	return Area;
}
public void setArea(String area) {
	Area = area;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public int getPinCode() {
	return PinCode;
}
public void setPinCode(int pinCode) {
	PinCode = pinCode;
}

public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [makanNo=" + makanNo + ", street=" + street + ", Area=" + Area + ", City=" + City + ", PinCode="
			+ PinCode + ", State=" + State + ", country=" + country + "]";
}

 
 
	
}
