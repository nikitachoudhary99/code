abstract class X
{
	abstract void show();
	void display()
	{
		System.out.println("Inside Normal Method");
	}
}
class Y extends X
{
	void show()
	{
		System.out.println("inside Abstract Method");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		//X x = new X();

		Y y = new  Y();
		y.show();
		y.display();
	}

}
