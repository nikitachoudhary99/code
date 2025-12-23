package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account extends Costumer{

private int AccNo;
private String AccHolder;
private double bal;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int id, String name,int accNo, String accHolder, double bal) {
	super(id, name);
	this.AccNo = accNo;
	this.AccHolder = accHolder;
	this.bal = bal;
	// TODO Auto-generated constructor stub
}

public int getAccNo() {
	return AccNo;
}
public void setAccNo(int accNo) {
	AccNo = accNo;
}
public String getAccHolder() {
	return AccHolder;
}
public void setAccHolder(String accHolder) {
	AccHolder = accHolder;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
@Override
public String toString() {
	return  AccNo + "\t" + AccHolder + "\t" + bal ;
}
	


}
