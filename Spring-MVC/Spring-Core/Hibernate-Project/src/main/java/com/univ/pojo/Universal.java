package com.univ.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="universaldetails")
public class Universal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="universalId")
private int id;
	@Column(name="universalfName")
private String FName;
	@Column(name="universalsName")
private String sName;
public Universal() {
	super();
	// TODO Auto-generated constructor stub
}
public Universal(int id, String fName, String sName) {
	super();
	this.id = id;
	this.FName = fName;
	this.sName = sName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFName() {
	return FName;
}
public void setFName(String fName) {
	this.FName = fName;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
@Override
public String toString() {
	return "Universal " + id + "\t" + FName + "\t" + sName + "\t";
}

	

}
