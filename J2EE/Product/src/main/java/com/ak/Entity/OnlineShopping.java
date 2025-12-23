package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OnlineShopping {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private String pId;
 private String pName;
 private int mob;
 private String add;
public OnlineShopping() {
	super();
	// TODO Auto-generated constructor stub
}
public OnlineShopping(String pId, String pName, int mob, String add) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.mob = mob;
	this.add = add;
}
public String getpId() {
	return pId;
}
public void setpId(String pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
@Override
public String toString() {
	return "OnlineShopping [pId=" + pId + ", pName=" + pName + ", mob=" + mob + ", add=" + add + "]";
}
 
}
