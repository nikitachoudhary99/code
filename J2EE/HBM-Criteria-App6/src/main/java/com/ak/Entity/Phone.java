package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="phone")
public class Phone {
	@Id
  private String msg;
  private String media;
  private String doq;
  private int price;
  private int mob;
public Phone() {
	super();
	// TODO Auto-generated constructor stub
}
public Phone(String msg, String media, String doq, int price, int mob) {
	super();
	this.msg = msg;
	this.media = media;
	this.doq = doq;
	this.price = price;
	this.mob = mob;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public String getMedia() {
	return media;
}
public void setMedia(String media) {
	this.media = media;
}
public String getDoq() {
	return doq;
}
public void setDoq(String doq) {
	this.doq = doq;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
@Override
public String toString() {
	return "Phone [msg=" + msg + ", media=" + media + ", doq=" + doq + ", price=" + price + ", mob=" + mob + "]";
}
  
}
