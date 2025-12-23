package com.univ.bean;

import org.springframework.stereotype.Component;

@Component
public class ABC {

	private int x;

	public ABC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ABC(int x) {
		System.out.println("**ABC Constructor DI**");
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
		return  x + "";
	}
	
}
