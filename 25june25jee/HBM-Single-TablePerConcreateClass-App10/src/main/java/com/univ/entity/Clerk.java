package com.univ.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clr")
public class Clerk extends Employee{

	private int ta;
	private int da;
	public Clerk() {
		
	}
	public Clerk(int empId, String empName, double salary,int ta,int da) {
		super(empId, empName, salary);
		this.ta = ta;
		this.da = da;
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
		return ta + "\t" + da;
	}
	
	
}
