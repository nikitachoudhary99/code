package com.practice;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter day number(1-7)");
		int day=sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAy");
			break;
		case 4:
			System.out.println("THUSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAy");
			break;
		default:
			System.out.println("INVALID NUMBER");
		}

	}

}
