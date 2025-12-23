package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dog")
public class Dog extends Animal{
private String Breed;
private int d_age;
public Dog() {
	super();
	// TODO Auto-generated constructor stub
}
public Dog(String name, int age,String breed, int d_age) {
	super(name, age);
	this.Breed = breed;
	this.d_age = d_age;
	
}
public String getBreed() {
	return Breed;
}
public void setBreed(String breed) {
	Breed = breed;
}
public int getD_age() {
	return d_age;
}
public void setD_age(int d_age) {
	this.d_age = d_age;
}
@Override
public String toString() {
	return  Breed + "\t" + d_age;
}
}
