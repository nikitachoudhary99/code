package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cat")
public class Cat extends Animal {

private String color;
private int year;
public Cat() {
	super();
}
public Cat(String name, int age,String color, int year) {
	super(name, age);
	this.color = color;
	this.year = year;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return color + "\t" + year;
}


}
