package com.univ.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeedetails")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "employeeId")
	private int empid;
	
	@Column(name = "employeeName")
	private String empName;
	
	@Column(name = "employeeSalary")
	private double Salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empName, double salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.Salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee" + empid + "\t" + empName + "\t" + Salary;
	}
	
	
	
}