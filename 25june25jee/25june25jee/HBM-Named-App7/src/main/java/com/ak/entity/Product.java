package com.ak.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@NamedQueries({@NamedQuery(name = "allpd",query = "from Product"),
		@NamedQuery(name = "whr",query = "from Product Where pId =:id")})

@NamedNativeQueries({@NamedNativeQuery(name = "selall",
query = "select * from product",resultClass = Product.class),
	@NamedNativeQuery(name = "whar",
	query = "select * from product where pid = ?",resultClass = Product.class)})

public class Product {

	@Id
	private int pId;
	private String pName;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String pName, double price) {
		super();
		this.pName = pName;
		this.price = price;
	}

	public Product(int pId, String pName, double price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
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
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return pId + "\n" + pName + "\t" + price;
	}
	
}
