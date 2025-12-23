package com.univ.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee {
	@Id
private int enpId;
private String empName;
private double Salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int enpId, String empName, double salary) {
	super();
	this.enpId = enpId;
	this.empName = empName;
	Salary = salary;
}
public int getEnpId() {
	return enpId;
}
public void setEnpId(int enpId) {
	this.enpId = enpId;
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
	Salary = salary;
}
@Override
public String toString() {
	return "Employee [enpId=" + enpId + ", empName=" + empName + ", Salary=" + Salary + "]";
}

}
