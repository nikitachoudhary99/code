package com.pkg1;

public class MainPkg1 {

	public static void main(String[] args) {
		SuperClass sup = new SuperClass(10,20,30,40);
		sup.show();
		SubPkg1 sub = new SubPkg1(100, 200, 300, 400);
		sub.show1();
		
		System.out.println("****Inside Main Classs****");
		//System.out.println("Private : "+sup.a);
		System.out.println("Default : "+sup.b);
		System.out.println("Protected : "+sup.c);
		System.out.println("Public : "+sup.d);
	}

}


