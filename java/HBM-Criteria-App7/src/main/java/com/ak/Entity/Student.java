package com.ak.Entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student-in")
public class Student {
	@Id
	
	private int roll;
	private String name;
	private String add;
	private String sub;
	private String clz;

	public Student() {
		super();
	}

	public Student(int roll, String name, String add, String sub, String clz) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
		this.sub = sub;
		this.clz = clz;
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getClz() {
		return clz;
	}

	public void setClz(String clz) {
		this.clz = clz;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + ", sub=" + sub + ", clz=" + clz + "]";
	}
}
