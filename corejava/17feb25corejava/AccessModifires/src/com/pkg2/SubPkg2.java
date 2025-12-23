package com.pkg2;

import com.pkg1.SuperClass;

public class SubPkg2 extends SuperClass{

	public SubPkg2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubPkg2(int a, int b, int c, int d) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
	}

	void show2()
	{
		System.out.println("****Inside Super Classs****");
		//System.out.println("Private : "+a);
		//System.out.println("Default : "+b);
		System.out.println("Protected : "+c);
		System.out.println("Public : "+d);
	}
	
}
