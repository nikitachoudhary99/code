class Base
{
	void show()
	{
		System.out.println("Inside Base");
	}
}
class Drv1 extends Base
{
	void show()
	{
		System.out.println("Inside Drv1");
	}
}
class Drv2 extends Base
{
	void show()
	{
		System.out.println("Inside Drv2");
	}
}
class Drv3 extends Base
{
	void show()
	{
		System.out.println("Inside Drv3");
	}
}

public class PolyDemo1 {

	public static void main(String[] args) {
		
		Base ref;
		Drv1 d1 = new Drv1();
		Drv2 d2 = new Drv2();
		Drv3 d3 = new Drv3();
		
		ref = d1;
		ref.show();
		
		ref = d2;
		ref.show();
		
		ref = d3;
		ref.show();

	}

}
