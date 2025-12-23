package com.univ.bean;

public class ABC {
	 private int x;

	public ABC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ABC(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "ABC=" + x + "\n";
	}
	 
}
