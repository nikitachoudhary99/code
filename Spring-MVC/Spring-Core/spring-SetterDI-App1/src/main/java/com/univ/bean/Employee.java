package com.univ.bean;


public class Employee {

	private int empId;
	private String empName;
	private double salary;
	private Address adr;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double salary, Address adr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.adr = adr;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return empId + "\t" + empName + "\t" + salary + "\t"+ adr;
	}
	
}
