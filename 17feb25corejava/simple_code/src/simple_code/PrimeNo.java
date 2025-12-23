package simple_code;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no ");
		int n=sc.nextInt();
		int i,count = 0;
		for(i=1;i<n;i++)
		{
			if(n % i==0)
			{
				System.out.println(i);
			}
		}
		if(count==0)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("not prime ");
		}

	}

}
