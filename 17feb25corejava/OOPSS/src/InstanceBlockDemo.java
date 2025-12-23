
class A
{
	int a;
	A() 
	{
	System.out.println("Inside No Args Constructor");
	a = 0;
	}
	A(int x)
	{
		System.out.println("Inside One Args Constructor");
		a = x;
	}
	
	{
	System.out.println("Inside Instance Block");
	}
}

public class InstanceBlockDemo 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A(10);
		final int x = 10; //final variable(constant)
		//x = 20; can not assign any value
		
		System.out.println(a1 instanceof A);
		if(a1 instanceof A)
		{
			System.out.println("a1 is an object of A class");
		}
		else
		{
			System.out.println("a1 is not an object of A class");
		}
		
	}

}
