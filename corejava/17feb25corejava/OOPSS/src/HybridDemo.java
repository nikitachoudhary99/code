class A1
{
	void show()
	{
		System.out.println("India");
	}
}
class B1 extends A1
{
	void show1()
	{
		System.out.println("M.P.");
	}
}
class C1 extends A1
{
	void show2()
	{
		System.out.println("U.P.");
	}
}
class D1 extends B1
{
	void show3()
	{
		System.out.println("Indore");
	}
}
public class HybridDemo {

	public static void main(String[] args) {
		
		A1 a = new A1();
		B1 b = new B1();
		C1 c = new C1();
		D1 d = new D1();
		
		
		a.show();
		
		b.show();
		b.show1();
		
		c.show();
		c.show2();
		
		d.show();
		d.show1();
		d.show3();

	}

}
