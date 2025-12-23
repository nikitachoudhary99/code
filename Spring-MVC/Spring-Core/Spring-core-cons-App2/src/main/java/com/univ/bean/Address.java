package com.univ.bean;

public class Address {
private int hno;
private String Street;
private String city;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String city) {
	super();
	this.city = city;
	System.out.println("one parameter Constructer");
}
public Address(String street, String city) {
	super();
	this.Street = street;
	this.city = city;
	System.out.println("two parameter Constructer");
}
public Address(int hno, String street, String city) {
	super();
	this.hno = hno;
	this.Street = street;
	this.city = city;
	System.out.println("three parameter Constructer");
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	this.Street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return  hno + "\t" + Street + "\t" + city;
}


}
