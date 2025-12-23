package com.univ.bean;

public class Container {

	private ABC abc;
	private XYZ xyz;
	public Container() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Container(ABC abc, XYZ xyz) {
		super();
		this.abc = abc;
		this.xyz = xyz;
	}
	public ABC getAbc() {
		return abc;
	}
	public void setAbc(ABC abc) {
		this.abc = abc;
	}
	public XYZ getXyz() {
		return xyz;
	}
	public void setXyz(XYZ xyz) {
		this.xyz = xyz;
	}
	@Override
	public String toString() {
		return abc + "\t" + xyz;
	}
	
}
