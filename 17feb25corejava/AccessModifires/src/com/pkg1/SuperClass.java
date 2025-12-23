package com.pkg1;

public class SuperClass {

	private int a;
	int b;
	protected int c;
	public int d;
	public SuperClass() {
		
	}
	public SuperClass(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public void show()
	{
		System.out.println("****Inside Super Classs****");
		System.out.println("Private : "+a);
		System.out.println("Default : "+b);
		System.out.println("Protected : "+c);
		System.out.println("Public : "+d);
	}
}
