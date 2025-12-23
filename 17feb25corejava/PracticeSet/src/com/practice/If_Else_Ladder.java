package com.practice;

import java.util.Scanner;

public class If_Else_Ladder {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks");
		double marks=sc.nextDouble();
		if(marks>=90) {
			System.out.println("GRADE A+");
		}
	    else if(marks>=75) {
			System.out.println("GRADE A");
		}
	    else if(marks>=60) {
	    	System.out.println("GRADE B+");
	    }
	    else if( marks>=40) {
	    	System.out.println("GRADE C");
	    }
	    else {
	    	System.out.println("FAIL");
	    }
	    	
	}

}
