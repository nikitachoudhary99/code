package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class Loan extends Costumer{

private String lname;
private double ammount;
public Loan() {
	super();
	// TODO Auto-generated constructor stub
}
public Loan(int id, String name,String lname, double ammount) {
	super(id, name);
	this.lname = lname;
	this.ammount = ammount;
	// TODO Auto-generated constructor stub
}
public String getName() {
	return lname;
}
public void setName(String name) {
	this.lname = name;
}
public double getAmmount() {
	return ammount;
}
public void setAmmount(double ammount) {
	this.ammount = ammount;
}
@Override
public String toString() {
	return  lname + "\t" + ammount ;
}

	


}
