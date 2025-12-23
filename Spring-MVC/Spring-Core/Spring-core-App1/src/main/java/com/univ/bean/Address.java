package com.univ.bean;

public class Address {
private int hNo;
private String Street;
private String City;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int hNo, String street, String city) {
	super();
	this.hNo = hNo;
	this.Street = street;
	this.City = city;
}
public int gethNo() {
	return hNo;
}
public void sethNo(int hNo) {
	this.hNo = hNo;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	this.Street = street;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	this.City = city;
}
@Override
public String toString() {
	return hNo + "\t" + Street + "\t" + City;
}

}
