package com.univ.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Kirana")
public class KiranaStore {
	@Id
private int pId;
private String pName;
private double Price;
public KiranaStore() {
	super();
	// TODO Auto-generated constructor stub
}
public KiranaStore(int pId, String pName, double price) {
	super();
	this.pId = pId;
	this.pName = pName;
	Price = price;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
@Override
public String toString() {
	return "KiranaStore [pId=" + pId + ", pName=" + pName + ", Price=" + Price + "]";
}

}
