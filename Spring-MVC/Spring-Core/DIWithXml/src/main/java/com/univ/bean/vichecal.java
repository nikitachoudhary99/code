package com.univ.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class vichecal {
	 private Car car;
	 private Bike bike;
	public vichecal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public vichecal(Car car, Bike bike) {
		System.out.println("constructor from car & bike ");
		this.car = car;
		this.bike = bike;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "vichecal=" + car + "\t" + bike;
	}
	 
}
