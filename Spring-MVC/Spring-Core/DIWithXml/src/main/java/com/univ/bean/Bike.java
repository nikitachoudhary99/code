package com.univ.bean;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	private int bNo;
	private double Price;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int bNo, double price) {
		System.out.println("from constructor of Bike");
		this.bNo = bNo;
		this.Price = price;
	}
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	@Override
	public String toString() {
		return "Bike=" + bNo + "\t" + Price;
	}
	
}
