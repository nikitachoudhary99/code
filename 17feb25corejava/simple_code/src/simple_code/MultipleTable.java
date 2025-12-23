package simple_code;

import java.util.Scanner;

//Write a program to print the multiplication table of a number.
public class MultipleTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no for tables");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}
