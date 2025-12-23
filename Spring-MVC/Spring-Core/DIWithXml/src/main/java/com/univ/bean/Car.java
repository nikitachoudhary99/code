package com.univ.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {
private int cNo;
private String company;
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
public Car(int cNo, String company) {
	System.out.println("from constructor Car");
	this.cNo = cNo;
	this.company = company;
}
public int getcNo() {
	return cNo;
}
public void setcNo(int cNo) {
	this.cNo = cNo;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
@Override
public String toString() {
	return "Car=" + cNo + "\t" + company;
}

}
