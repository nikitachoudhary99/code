import java.util.Scanner;

public class ExDemo2 {

	public static void main(String[] args) {
		System.out.println("Helloooooo....!");
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value:");
		a = s.nextInt();
		try 
		{
			b = 123/a;
			System.out.println("b = "+b);	
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Divided by Zero Exception");
		}
		System.out.println("Byeeeeeeeeee....!");
	}

}
