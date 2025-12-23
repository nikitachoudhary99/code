package com.pkg1;

public class SubPkg1 extends SuperClass{

	public SubPkg1() {
		super();
	}

	public SubPkg1(int a, int b, int c, int d) {
		super(a, b, c, d);
	}
	
	void show1()
	{
		System.out.println("****Inside Sub Classs****");
		//System.out.println("Private : "+a);
		System.out.println("Default : "+b);
		System.out.println("Protected : "+c);
		System.out.println("Public : "+d);
	}
}
