package com.univ.Entity;

import javax.persistence.Entity;

@Entity
public class Clerck extends Employee {
 private int ta;
 private int da;
public Clerck() {
	super();
	// TODO Auto-generated constructor stub
}
public Clerck(int enpId, String empName, double salary,int ta,int da) {
	super(enpId, empName, salary);
	// TODO Auto-generated constructor stub
	this.da=da;
	this.ta=ta;
}
public int getTa() {
	return ta;
}
public void setTa(int ta) {
	this.ta = ta;
}
public int getDa() {
	return da;
}
public void setDa(int da) {
	this.da = da;
}
@Override
public String toString() {
	return   ta + "\t" + da  ;
}
 
}
