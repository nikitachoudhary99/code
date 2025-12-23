class Throw
{
	void method(int x)
	{
		try {
			int a = 123/x;
			System.out.println("a = "+a);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("catch first time");
			throw e;
		}
		
		
	}
}
public class ThrowDemo {

	public static void main(String[] args) {
		
		Throw t = new Throw();
		try {
			t.method(0);	
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("catch second time");
		}
		
		System.out.println("Bye...........!");

	}

}
