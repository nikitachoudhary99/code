package com.univ.entity;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee{

	private int mgrId;
	private String dept;
	public Manager() {
	
	}
	public Manager(int empId, String empName, double salary,int mgrId,String dept) {
		super(empId, empName, salary);
		this.mgrId = mgrId;
		this.dept = dept;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return  mgrId + "\t" + dept;
	}
	
}
