package loop_IterationsStatement;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no for fact");
		int num=sc.nextInt();
		int fact=sc.nextInt();
		for(int i=1;i<num;i++) {
			fact=fact*i;
		}
		System.out.println("fact="+num+"="+fact);
	}

}
