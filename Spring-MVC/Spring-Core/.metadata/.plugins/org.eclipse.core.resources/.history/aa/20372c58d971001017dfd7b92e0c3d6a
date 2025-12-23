package com.univ.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productdetails")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "productId")
	private int pid;
	
	@Column(name = "productName")
	private String pName;
	
	@Column(name = "productPrice")
	private double Price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pName, double price) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.Price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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
		return "Product" + pid + "\t" + pName + "\t" + Price;
	}
	
	
		
	
}