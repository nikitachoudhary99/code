package com.univ.bean;

import java.util.Set;

public class Product {

	private Set<String>pdr;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Set<String> pdr) {
		super();
		this.pdr = pdr;
	}

	public Set<String> getPdr() {
		return pdr;
	}

	public void setPdr(Set<String> pdr) {
		this.pdr = pdr;
	}

	@Override
	public String toString() {
		return "pdr = " + pdr + "\n";
	}
	
}
