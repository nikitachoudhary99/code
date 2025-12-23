package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pasport")
public class Passport {
@Id

	private int id;
	private String name;
	@OneToOne()
	@JoinColumn(name="personId",unique=true)
	Person per;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(int id, String name, Person per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	public Passport(int i, String string) {
		// TODO Auto-generated constructor stub
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
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
}
