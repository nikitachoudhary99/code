package com.pkg2;

import com.pkg1.SuperClass;

public class MainPkg2 {

	public static void main(String[] args) {
		
		SubPkg2 sub = new SubPkg2(1, 2, 3, 4);
		sub.show2();

		SuperClass sup = new SuperClass(100,200,300,400);
//		System.out.println("Private : "+sup.a);
//		System.out.println("Default : "+sup.b);
//		System.out.println("Protected : "+sup.c);
		System.out.println("Public : "+sup.d);
	}

}
