package com.univ.bean;

public class XYZ {
private int y;

public XYZ() {
	super();
	// TODO Auto-generated constructor stub
}

public XYZ(int y) {
	super();
	this.y = y;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

@Override
public String toString() {
	return "XYZ=" + y + "\n";
}
	
}
