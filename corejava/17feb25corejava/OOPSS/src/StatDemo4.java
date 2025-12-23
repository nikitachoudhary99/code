class Stat22
{
	static int a; //data member
	Stat22()
	{
		a = 5;
		System.out.println("**Inside Constructor**->"+a);
	}
	static
	{
		a = 15;
		System.out.println("**Inside Static Block**->"+a);
	}
	
	{
		a = 10;
		System.out.println("**Inside Instance Block**->"+a);
	}
	
	static void show()
	{
		a = 20;
		System.out.println("**Inside Method**->"+a);
	}
}
public class StatDemo4 {

	public static void main(String[] args) {
		
		Stat22  s = new Stat22();
		s.show();
	}

}
