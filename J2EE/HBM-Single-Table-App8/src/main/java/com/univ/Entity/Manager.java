package com.univ.Entity;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee {

	private int mgrId;
	private String dept;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int enpId, String empName, double salary,int mgrId,String dept) {
		super(enpId, empName, salary);
				this.mgrId=mgrId;
		        this.dept=dept;
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
		return "Manager [mgrId=" + mgrId + "\t" + dept + "]";
	}
	
	
}
