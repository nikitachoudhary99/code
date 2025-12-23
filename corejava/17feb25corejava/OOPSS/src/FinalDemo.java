final class FinalClass
{
	int a;
	final int b=10;
	FinalClass(int x)
	{
		a = x;
		//b = 34;can not assign
	}
	final void show()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
class SubClass extends FinalClass//Error
{
	SubClass(int x)
	{
		//super(x);//FinalClass(x)
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
		sub.show1();
	}

}
