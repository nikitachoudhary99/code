package com.practice;

import java.util.Scanner;

public class Nested_If_else {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("ENTER YOUR AGE");
			int age=sc.nextInt();
			
			System.out.println("Do you have any id (TRUE / FALSE)");
			boolean id=sc.nextBoolean();
			if(age>=18) {
				if(id) {
					System.out.println("you are elegible for voting");
				}
				else
				{
					System.out.println("you are not eligable for voting");
				}
			}
			else
			{
				System.out.println("you are to young apply better luck next time");
			}
			sc.close();
	}

}
