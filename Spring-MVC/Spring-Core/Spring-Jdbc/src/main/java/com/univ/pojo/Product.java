package com.univ.pojo;

public class Product {
 private int pId;
 private String pName;
 private double Price;
 	public Product() {
	super();
	// TODO Auto-generated constructor stub
 					}
	public Product(int pId, String pName, double price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.Price = price;
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
		this.Price = price;
	}
	@Override
	public String toString() {
		return "Product " + pId + "\t" + pName + "\t" + Price;
	}
 	
 
 
}
