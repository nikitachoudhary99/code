package com.univ.bean;

public class Address {

	private int hNo;
	private String street;
	private String city;
	public Address() {
		System.out.println("**No Args Const DI**");
	}
	
	
	public Address(String city) {
		System.out.println("**One Args Const DI**");
		this.city = city;
	}


	public Address(String street, String city) {
		System.out.println("**Two Args Const DI**");
		this.street = street;
		this.city = city;
	}


	public Address(int hNo, String street, String city) {
		System.out.println("**Three Args Const DI**");
		this.hNo = hNo;
		this.street = street;
		this.city = city;
	}
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		System.out.println("**hNo Setter Called**");
		this.hNo = hNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("**street Setter Called**");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("**city Setter Called**");
		this.city = city;
	}
	@Override
	public String toString() {
		return hNo + "\t" + street + "\t" + city;
	}
}
