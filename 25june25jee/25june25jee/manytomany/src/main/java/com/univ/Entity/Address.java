package com.univ.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.univ.Entity.Employee;

@Entity
@Table(name="adr")
public class Address {
	@Id
	private int hno;
	private String Street;
	private String City;
	@ManyToMany
	@JoinTable(name = "emp_dept",joinColumns = {@JoinColumn(name="deptId")},
	inverseJoinColumns = {@JoinColumn(name="empId")})
	private Set<Employee>emps = new HashSet<>();
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int hno, String street, String city, Set<Employee> emps) {
		super();
		this.hno = hno;
		this.Street = street;
		this.City = city;
		this.emps = emps;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		this.Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public Set<Employee> getEmps() {
		return emps;
	}
	public void setEmps(Set<Employee> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Address =" + hno + "\t" + Street + "\t" + City + "\t" + emps;
	}
	
	
}
