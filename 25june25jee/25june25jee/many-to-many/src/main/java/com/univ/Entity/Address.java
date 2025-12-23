package com.univ.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="adrs")
public class Address {
	@Id
private int hno;
private String Street;
private String City;
@ManyToMany
@JoinTable(name="per_adr",joinColumns = {@JoinColumn(name="hno")},inverseJoinColumns = {@JoinColumn(name="perid")})

private Set<Person>person=new HashSet<Person>();
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int hno, String street, String city) {
	super();
	this.hno = hno;
	this.Street = street;
	this.City = city;

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
public Set<Person> getPerson() {
	return person;
}
public void setPerson(Set<Person> person) {
	this.person = person;
}
@Override
public String toString() {
	return "Address=" + hno + "\t" + Street + "\t" + City;
}

}
