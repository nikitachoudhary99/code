package loop_IterationsStatement;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no for table");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}

	}

}
