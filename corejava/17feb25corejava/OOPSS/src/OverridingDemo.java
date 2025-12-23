class A2
{
	void show()
	{
		System.out.println("Inside A");
	}
}
class B2 extends A2
{
	void show()//method overriding
	{
		super.show();
//super : it is a keyword represent the name of super class inside sub class		
		System.out.println("Inside B");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		
		B2 b = new B2();
		b.show();

	}
}
