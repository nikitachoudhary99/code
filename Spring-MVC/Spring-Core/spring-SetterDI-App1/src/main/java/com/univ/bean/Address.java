package com.univ.bean;

public class Address {
private int hNo;
private String street;
private String city;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int hNo, String street, String city) {
	super();
	this.hNo = hNo;
	this.street = street;
	this.city = city;
}
public int gethNo() {
	return hNo;
}
public void sethNo(int hNo) {
	this.hNo = hNo;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address="+ hNo + "\t" + street + "\t" + city;
}

}
