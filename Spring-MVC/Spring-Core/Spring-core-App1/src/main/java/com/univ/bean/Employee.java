package com.univ.bean;

public class Employee {
private int empId;
private String name;
private double Salary;
private String add;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String name, double salary,String add) {
	super();
	this.empId = empId;
	this.name = name;
	this.Salary = salary;
	this.add=add;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	this.Salary = salary;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
@Override
public String toString() {
	return  empId + "\t" + name + "\t" + Salary + "\t" + add;
}


}
