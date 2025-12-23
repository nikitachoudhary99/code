package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class Animal {
@Id
private String Name;
private int age;
public Animal() {
	super();
	// TODO Auto-generated constructor stub
}
public Animal(String name, int age) {
	super();
	this.Name = name;
	this.age = age;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return  Name + "\t" + age;
}

}
