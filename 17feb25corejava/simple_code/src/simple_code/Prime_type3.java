package simple_code;

import java.util.Scanner;

public class Prime_type3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no to check primr or not");
		int n= sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		if( count==0)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}
		

	}

}
