package com.univ.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentdetails")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "studentId")
	private int sid;
	
	@Column(name = "studentName")
	private String studName;
	
	@Column(name = "studentCity")
	private String studCity;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String studName, String studCity) {
		super();
		this.sid = sid;
		this.studName = studName;
		this.studCity = studCity;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studName=" + studName + ", studCity=" + studCity + "]";
	}
	
}
