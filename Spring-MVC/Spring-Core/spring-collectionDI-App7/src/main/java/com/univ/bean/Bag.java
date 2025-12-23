package com.univ.bean;

import java.util.List;

public class Bag {
private List<String>balls;

public Bag() {
	super();
	// TODO Auto-generated constructor stub
}

public Bag(List<String> balls) {
	super();
	this.balls = balls;
}

public List<String> getBalls() {
	return balls;
}

public void setBalls(List<String> balls) {
	this.balls = balls;
}

@Override
public String toString() {
	return "Bag=" + balls;
}

}
