import java.util.Scanner;

public class ExDemo3 {

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
			if(a==1)
			{
				int ar[]= {1,2,3};
				ar[5]=345;
			}
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Divided by Zero Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Index Exccccccceeeeeeeedddd");
		}
		System.out.println("Byeeeeeeeeee....!");
	}

}
