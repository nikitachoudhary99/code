package com.ak.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Product {
  @Id
  
  @GeneratedValue(strategy =GenerationType.AUTO)
	
  private int pId;
  
  @Column(name="p_name",nullable=false)
	private String pName;
	private double Price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String pName, double price) {
		super();
		this.pName = pName;
		Price = price;
	}

	public Product(int pId, String pName, double price) {
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
		return "Product [pId=" + pId + ", pName=" + pName + ", Price=" + Price + "]";
	}
	
}
