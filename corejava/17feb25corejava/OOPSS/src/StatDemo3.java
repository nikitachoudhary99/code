class Stat2
{
	static int a; //data member
	
	static
	{
		a = 5;
		System.out.println("Inside Static Block");
	}
	static void show(int x)
	{
		System.out.println("a = "+a);
		System.out.println("x = "+x);
	}
}
public class StatDemo3 {

	public static void main(String[] args) {
		
		Stat2.show(5);
		Stat2.show(6);
		Stat2.show(7);

	}

}
