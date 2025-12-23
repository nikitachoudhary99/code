 class FinalClass
{
	int a;
	final int b=10;
	FinalClass(int x)
	{
		a = x;
		//b = 34;can not assign
	}
	 void show()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
class SubClass extends FinalClass//Error
{
	
	public SubClass(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	void show()//Error
	{
		super.show();
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		SubClass sub = new SubClass(100);
		sub.show();
	}

}
