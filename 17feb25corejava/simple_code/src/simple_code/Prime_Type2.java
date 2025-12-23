package simple_code;

import java.util.Scanner;

public class Prime_Type2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr the no  for cheack no is prime or not");
		int n=sc.nextInt();
		int i,count=0;
		for(i=2;i<=(n/2);i++)
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
