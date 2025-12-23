package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")

public class Person {
	@Id
	private int id;
    private String name;
    private int age;
    @OneToOne
    @JoinColumn(name="id",unique = true)
    AadharCard ac;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public AadharCard getAc() {
		return ac;
	}
	public void setAc(AadharCard ac) {
		this.ac = ac;
	}
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + age;
	}
    
}
