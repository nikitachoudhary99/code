package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="costumer")
@Inheritance(strategy = InheritanceType.JOINED)
public class Costumer {
	@Id
	private int id;
	private String name;
	
	public Costumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Costumer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return id + "\t" + name ;
	}
	

}
