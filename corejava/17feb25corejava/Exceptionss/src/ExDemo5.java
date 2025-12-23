import java.util.Scanner;

public class ExDemo5 {

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
			if(a==2)
			{
				String str = "123aa";
				int x = Integer.parseInt(str);
			}
		}
		catch (Exception e) 
		{
			//e.printStackTrace();
			//System.out.println("catche by univarsal catch block:"+e);
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I Will Execute Always");
		}
		
		System.out.println("Byeeeeeeeeee....!");
	}

}
