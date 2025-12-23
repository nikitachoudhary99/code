package com.univ.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
   @Id
	private int eId;
	private String eName;
	private double Salary;
	private double experience;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String eName, double salary, double experience) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.Salary = salary;
		this.experience = experience;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		this.Salary = salary;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", Salary=" + Salary + ", experience=" + experience + "]";
	}
	
}
