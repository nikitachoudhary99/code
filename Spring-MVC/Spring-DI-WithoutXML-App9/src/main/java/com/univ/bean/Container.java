package com.univ.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Container {

	
	private ABC abc;
	private XYZ xyz;
	public Container() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Autowired
	public Container(ABC abc, XYZ xyz) {
		super();
		this.abc = abc;
		this.xyz = xyz;
	}
	public ABC getAbc() {
		return abc;
	}
	@Autowired
	public void setAbc(ABC abc) {
		System.out.println("**ABC Setter DI**");
		this.abc = abc;
	}
	public XYZ getXyz() {
		return xyz;
	}
	@Autowired
	public void setXyz(XYZ xyz) {
		System.out.println("**XYZ Setter DI**");
		this.xyz = xyz;
	}
	@Override
	public String toString() {
		return abc + "\t" + xyz;
	}
	
}
