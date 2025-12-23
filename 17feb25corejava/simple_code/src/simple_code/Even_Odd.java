package simple_code;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		//Write a program to check whether a number is even or odd.
		Scanner sc= new Scanner(System.in);
		
				System.out.println("enter the num");
				int num=sc.nextInt();

					if(num % 2 == 0)
					{
						System.out.println("number is even");
					}
					else
					{
						System.out.println("number is odd");
					}

	}

}
