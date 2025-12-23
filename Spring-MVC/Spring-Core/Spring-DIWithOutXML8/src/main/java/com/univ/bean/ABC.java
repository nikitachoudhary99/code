package com.univ.bean;

public class ABC {
	 private int x;

	public ABC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ABC(int x) {
		System.out.println("ABC constructer");
		
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("ABC setter");

		this.x = x;
	}

	@Override
	public String toString() {
		return "ABC=" + x + "\n";
	}
	 
}
