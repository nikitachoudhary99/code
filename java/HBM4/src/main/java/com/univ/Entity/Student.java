package com.univ.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student {
  @Id
	private int roll;
	private String name;
	private double marks;
	private String email;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, double marks, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.email = email;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", email=" + email + "]";
	}
	
	
}
